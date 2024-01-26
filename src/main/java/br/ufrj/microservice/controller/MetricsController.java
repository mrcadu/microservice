package br.ufrj.microservice.controller;

import br.ufrj.microservice.model.Request;
import br.ufrj.microservice.service.RequestService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metrics")
@RequiredArgsConstructor
public class MetricsController {
    private final RequestService requestService;
    @GetMapping
    public Request getMetrics(HttpServletRequest request) {
        return requestService.save(new Request(request));
    }
}
