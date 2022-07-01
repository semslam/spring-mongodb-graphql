package com.springmongodbgraphql.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "student")
public class Student {

	@Id
	@Getter @Setter private String id;

	@Getter @Setter private String name;

	@Field(name = "mail")
	@Getter @Setter private String email;

	@Getter @Setter private Department department;

	@Getter @Setter private List<Subject> subjects;
	
	@Transient
	@Setter private double percentage;


	public double getPercentage() {
		if (subjects != null && subjects.size() > 0) {
			int total = 0;
			for (Subject subject : subjects) {
				total += subject.getMarksObtained();
			}
			return total/subjects.size();
		}
		return 0.00;
	}

}
