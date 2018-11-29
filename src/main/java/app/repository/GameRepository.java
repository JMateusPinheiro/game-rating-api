package app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import app.model.Game;

@Repository
public interface GameRepository extends MongoRepository<Game, String> {

}
