package app.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Comment {
	
	@Id
	String id;
	String text;
	int likes;
	
}
