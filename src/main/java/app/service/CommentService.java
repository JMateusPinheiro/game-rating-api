package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.model.Comment;
import app.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	CommentRepository commentRepository;
	
	ObjectMapper mapper = new ObjectMapper();
	
	public String create(Comment comment) {
		return "";
	}
	
	public String getAll() {
		return "";
	}
	
	public String get(int id) {
		return "";
	}
	
	public String update(int id, Comment comment) {
		return "";
	}
	
	public String delete(int id) {
		return "";
	}

}
