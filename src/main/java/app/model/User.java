package app.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String fistName;
	private String lastName;
	private Gender gender;
	private String imageURL;
	
	private enum Gender{
		Male,Female,None;
	}
}
