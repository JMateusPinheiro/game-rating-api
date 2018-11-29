package app.model;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document
@Getter
@Setter
@ToString
public class Game {
		
	@Id
	private String id;
	private String name;
	private String description;
	private List<String> categories;
	private float criticalNote;
	private int year;
	private String imageURL;
	private List<Note> publicNotes;
}
