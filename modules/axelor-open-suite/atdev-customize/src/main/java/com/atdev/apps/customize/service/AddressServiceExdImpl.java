package com.atdev.apps.customize.service;

import java.util.List;

import com.axelor.apps.base.db.Address;
import com.axelor.apps.base.db.City;
import com.axelor.apps.base.db.Country;
import com.axelor.apps.base.db.Department;
import com.axelor.apps.base.db.Street;
import com.axelor.apps.base.db.repo.AddressRepository;
import com.axelor.apps.base.db.repo.CityRepository;
import com.axelor.apps.base.db.repo.DepartmentRepository;

import com.axelor.apps.base.db.repo.StreetRepository;
import com.axelor.apps.base.service.MapService;
import com.axelor.apps.base.service.app.AppBaseService;
import com.google.inject.Inject;

public class AddressServiceExdImpl implements AddressServiceExd{
	
	
	 @Inject protected AddressRepository addressRepo;
	  @Inject protected com.axelor.apps.tool.address.AddressTool ads;
	  @Inject protected MapService mapService;
	  @Inject protected CityRepository cityRepository;
	  @Inject protected StreetRepository streetRepository;
	  @Inject protected AppBaseService appBaseService;
	  @Inject protected DepartmentRepository DepartmentRepository;



	@Override
	public void autocompleteAddressNew(Address address) {
		 String zip = address.getZip();
		    if (zip == null) {
		      return;
		    }
		    Country country = address.getAddressL7Country();

		    List<City> cities =
		        cityRepository
		            .all()
		            .filter("self.zip = :zip AND self.country = :country")
		            .bind("zip", zip)
		            .bind("country", country)
		            .fetch();
		    City city = cities.size() == 1 ? cities.get(0) : null;
		    address.setCity(city);
		    address.setAddressL6(city != null ? zip + " " + city.getName() : null);
		    
		    
		    List<Department> departments =
		    		DepartmentRepository
			            .all()
			            .filter("self.city = :city AND self.country = :country")
			            .bind("city", city)
			            .bind("country", country)
			            .fetch();
		    Department department = departments.size() == 1 ? departments.get(0) : null;
			    address.setDepartment(department);;
			    address.setAddressL6(department != null ? zip + " " + department.getName() : null);
		    
		    

		    if (appBaseService.getAppBase().getStoreStreets()) {
		      List<Street> streets =
		          streetRepository.all().filter("self.city = :city").bind("city", city).fetch();
		      if (streets.size() == 1) {
		        Street street = streets.get(0);
		        address.setStreet(street);
		        String name = street.getName();
		        String num = address.getStreetNumber();
		        address.setAddressL4(num != null ? num + " " + name : name);
		      } else {
		        address.setStreet(null);
		        address.setAddressL4(null);
		      }
		    }
		
	}

}
