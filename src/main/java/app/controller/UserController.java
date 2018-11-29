package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.model.User;
import app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/")
	@ResponseBody
	public ResponseEntity<?> create(User user){
		return ResponseEntity.ok("");
	}
	
	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok("Everythings Ok");
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") int id){
		return ResponseEntity.ok("Everythings Ok");
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		return ResponseEntity.ok("Everythings Ok");
	}
	
	@PutMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> update(@PathVariable("id") int id){
		return ResponseEntity.ok("Everythings Ok");
	}

}
