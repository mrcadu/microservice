package br.ufrj.microservice.controller;

import br.ufrj.microservice.model.Score;
import br.ufrj.microservice.service.ScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/score")
public class ScoreController {
    private final ScoreService scoreService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public List<Score> createAll(@RequestBody List<Score> scores) {
        return scoreService.saveAll(scores);
    }
}
