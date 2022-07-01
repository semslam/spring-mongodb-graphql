package com.springmongodbgraphql.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;

public class Department {

	@Field(name = "department_name")
	@Getter @Setter private String departmentName;

	@Getter @Setter private String location;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
