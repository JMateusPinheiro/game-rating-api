package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.model.Game;
import app.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	GameRepository gameRepository;

	ObjectMapper mapper = new ObjectMapper();

	public String create(Game game) {
		try {
			gameRepository.save(game);
			return mapper.writeValueAsString("Game Saved");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getAll() {
		try {
			return mapper.writeValueAsString(gameRepository.findAll());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

	public String get(String id) {
		try {
			return mapper.writeValueAsString(gameRepository.findById(id));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

	public String update(String id, Game game) {
		try {
			Game gameForUpdate = gameRepository.findById(id).get();
			gameForUpdate.setId(game.getId());
			gameForUpdate.setName(game.getName());
			gameForUpdate.setDescription(game.getDescription());
			gameForUpdate.setCategories(game.getCategories());
			gameForUpdate.setYear(game.getYear());
			gameForUpdate.setCriticalNote(game.getCriticalNote());
			gameForUpdate.setPublicNotes(game.getPublicNotes());
			gameForUpdate.setImageURL(game.getImageURL());
			return mapper.writeValueAsString(gameRepository.save(gameForUpdate));
		} catch (Exception e) {
			return null;
		}
	}

	public String delete(String id) {
		try {
			gameRepository.deleteById(id);
			return mapper.writeValueAsString("Game Deleted");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

}
