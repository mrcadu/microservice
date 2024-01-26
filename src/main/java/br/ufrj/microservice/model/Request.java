package br.ufrj.microservice.model;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.IOException;

@Data
@NoArgsConstructor
public class Request {
    @Id
    private String id;
    private String ip;
    private String userAgent;
    private String url;
    private String body;
    private String contentType;
    public Request(HttpServletRequest request) {
        this.ip = request.getRemoteAddr().equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : request.getRemoteAddr();
        this.userAgent = request.getHeader("User-Agent");
        this.url = request.getRequestURL().toString();
        try {
            this.body = request.getReader().lines().reduce("", (accumulator, actual) -> accumulator + actual);
        } catch (IOException e) {
            this.body = null;
        }
        this.contentType = request.getContentType();
    }
}
