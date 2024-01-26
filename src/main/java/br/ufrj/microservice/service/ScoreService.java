package br.ufrj.microservice.service;

import br.ufrj.microservice.model.Score;
import br.ufrj.microservice.repository.ScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScoreService {
    private final ScoreRepository scoreRepository;
    public List<Score> saveAll(List<Score> scores) {
        return scoreRepository.saveAll(scores);
    }
}
