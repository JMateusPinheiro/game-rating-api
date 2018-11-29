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

import app.model.Game;
import app.service.GameService;

@RestController
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	GameService gameService;
	
	@PostMapping("/")
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody Game game){
		System.out.println(game.toString());
		return ResponseEntity.ok(gameService.create(game));
	}
	
	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(gameService.getAll());
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id){
		return ResponseEntity.ok(gameService.get(id));
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable("id") String id){
		return ResponseEntity.ok(gameService.delete(id));
	}
	
	@PutMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody Game game){
		return ResponseEntity.ok(gameService.update(id, game));
	}
}
