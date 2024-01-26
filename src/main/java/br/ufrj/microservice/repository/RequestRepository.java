package br.ufrj.microservice.repository;

import br.ufrj.microservice.model.Request;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestRepository extends MongoRepository<Request, String>{
}
