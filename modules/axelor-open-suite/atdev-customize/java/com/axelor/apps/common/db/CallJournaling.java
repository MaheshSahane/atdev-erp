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
@Table(name = "COMMON_CALL_JOURNALING")
public class CallJournaling extends AuditableModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMMON_CALL_JOURNALING_SEQ")
	@SequenceGenerator(name = "COMMON_CALL_JOURNALING_SEQ", sequenceName = "COMMON_CALL_JOURNALING_SEQ", allocationSize = 1)
	private Long id;

	@Widget(title = "Duration")
	private String duration;

	@Widget(title = "Mobile Phone")
	private String mobilephone;

	@Widget(title = "Agent")
	private String agent;

	@Widget(title = "Attributes")
	@Basic(fetch = FetchType.LAZY)
	@Type(type = "json")
	private String attrs;

	public CallJournaling() {
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
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
		if (!(obj instanceof CallJournaling)) return false;

		final CallJournaling other = (CallJournaling) obj;
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
			.add("duration", getDuration())
			.add("mobilephone", getMobilephone())
			.add("agent", getAgent())
			.omitNullValues()
			.toString();
	}
}
