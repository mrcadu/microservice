package br.ufrj.microservice.repository;

import br.ufrj.microservice.model.Score;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScoreRepository extends MongoRepository<Score, String> {
}
