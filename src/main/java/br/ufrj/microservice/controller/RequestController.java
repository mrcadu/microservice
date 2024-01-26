package br.ufrj.microservice.controller;

import br.ufrj.microservice.model.Request;
import br.ufrj.microservice.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/request")
public class RequestController {
    private final RequestService requestService;
    @GetMapping
    public List<Request> getAll() {
        return requestService.getAll();
    }
}
