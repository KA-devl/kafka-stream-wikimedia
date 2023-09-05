package com.example.service;

import reactor.core.publisher.Mono;

public interface VechicleService {

    public Mono<String> getData();
}
