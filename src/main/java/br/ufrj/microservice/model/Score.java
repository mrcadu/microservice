package br.ufrj.microservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
public class Score {
    @Id
    private String id;
    private String ip;
    private BigDecimal trustScore;
}
