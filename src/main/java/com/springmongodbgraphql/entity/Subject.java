package com.springmongodbgraphql.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;

public class Subject {

	@Field(name = "subject_name")
	@Getter @Setter private String subjectName;

	@Field(name = "marks_obtained")
	@Getter @Setter private int marksObtained;


}
