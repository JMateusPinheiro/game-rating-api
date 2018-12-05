package app.model;

import java.util.List;

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
	String userId;
	String gameId;
	String text;
	int likes;
	List<Comment> answers;
	
}
