package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import app.model.User;
import app.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public String create(@RequestBody User user) {
		return "";
	}
	
	public String getAll() {
		return "";
	}
	
	public String get(int id) {
		return "";
	}
	
	public String update(int id) {
		return "";
	}
	
	public String delete(int id) {
		return "";
	}
	
}
