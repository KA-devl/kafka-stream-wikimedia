package com.example.service.impl;

import com.example.service.VechicleService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Service
public class VechiclePositionImpl  implements VechicleService {
    private final WebClient webClient;

    public VechiclePositionImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.stm.info/pub/od/gtfs-rt/ic/v2/vehiclePositions?apiKey=l764419bfc7c9f4b7f870cb62387d11df3").build();
    }

    public Mono<String> getData() {
        return webClient.get()
                .retrieve()
                .bodyToMono(String.class);
    }

}
