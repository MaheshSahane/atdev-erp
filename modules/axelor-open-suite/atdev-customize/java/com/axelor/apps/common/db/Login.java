/*
 * Axelor Business Solutions
 * 
 * Copyright (C) 2020 Axelor (<http://axelor.com>).
 * 
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.common.db;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.axelor.auth.db.AuditableModel;
import com.axelor.db.annotations.Widget;
import com.google.common.base.MoreObjects;

@Entity
@Table(name = "COMMON_LOGIN")
public class Login extends AuditableModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMMON_LOGIN_SEQ")
	@SequenceGenerator(name = "COMMON_LOGIN_SEQ", sequenceName = "COMMON_LOGIN_SEQ", allocationSize = 1)
	private Long id;

	@Widget(title = "User Name")
	private String user_name;

	@Widget(title = "Login Time")
	private String login_time;

	@Widget(title = "Logout Time")
	private String logout_time;

	@Widget(title = "Extra Field 1")
	private String extra_field_1;

	@Widget(title = "Extra Field 2")
	private String extra_field_2;

	@Widget(title = "Extra Field 3")
	private String extra_field_3;

	@Widget(title = "Extra Field 4")
	private String extra_field_4;

	@Widget(title = "Attributes")
	@Basic(fetch = FetchType.LAZY)
	@Type(type = "json")
	private String attrs;

	public Login() {
	}

	public Login(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getLogin_time() {
		return login_time;
	}

	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}

	public String getLogout_time() {
		return logout_time;
	}

	public void setLogout_time(String logout_time) {
		this.logout_time = logout_time;
	}

	public String getExtra_field_1() {
		return extra_field_1;
	}

	public void setExtra_field_1(String extra_field_1) {
		this.extra_field_1 = extra_field_1;
	}

	public String getExtra_field_2() {
		return extra_field_2;
	}

	public void setExtra_field_2(String extra_field_2) {
		this.extra_field_2 = extra_field_2;
	}

	public String getExtra_field_3() {
		return extra_field_3;
	}

	public void setExtra_field_3(String extra_field_3) {
		this.extra_field_3 = extra_field_3;
	}

	public String getExtra_field_4() {
		return extra_field_4;
	}

	public void setExtra_field_4(String extra_field_4) {
		this.extra_field_4 = extra_field_4;
	}

	public String getAttrs() {
		return attrs;
	}

	public void setAttrs(String attrs) {
		this.attrs = attrs;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (!(obj instanceof Login)) return false;

		final Login other = (Login) obj;
		if (this.getId() != null || other.getId() != null) {
			return Objects.equals(this.getId(), other.getId());
		}

		return false;
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("id", getId())
			.add("user_name", getUser_name())
			.add("login_time", getLogin_time())
			.add("logout_time", getLogout_time())
			.add("extra_field_1", getExtra_field_1())
			.add("extra_field_2", getExtra_field_2())
			.add("extra_field_3", getExtra_field_3())
			.add("extra_field_4", getExtra_field_4())
			.omitNullValues()
			.toString();
	}
}
