package com.springmongodbgraphql.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;

public class Department {

	@Field(name = "department_name")
	@Getter @Setter private String departmentName;

	@Getter @Setter private String location;
}
