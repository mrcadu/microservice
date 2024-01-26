package br.ufrj.microservice.service;

import br.ufrj.microservice.model.Request;
import br.ufrj.microservice.repository.RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestService {
    private final RequestRepository requestRepository;

    public Request save(Request request) {
        return requestRepository.save(request);
    }

    public List<Request> getAll() {
        return requestRepository.findAll();
    }
}
