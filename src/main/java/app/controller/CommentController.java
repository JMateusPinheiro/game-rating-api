package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.model.Comment;
import app.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@PostMapping("/")
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody Comment comment){
		return ResponseEntity.ok(commentService.create(comment));
	}
	
	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(commentService.getAll());
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") int id){
		return ResponseEntity.ok(commentService.get(id));
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		return ResponseEntity.ok(commentService.delete(id));
	}
	
	@PutMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody Comment comment){
		return ResponseEntity.ok(commentService.update(id, comment));
	}

}
