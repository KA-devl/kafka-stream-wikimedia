package com.example.controller;

import com.example.service.VechicleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/stm/api/v1")
public class STMcontroller {

    private static final Logger LOGGER = LoggerFactory.getLogger(STMcontroller.class);

    private final VechicleService vehicleService;

    public STMcontroller(VechicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
    @GetMapping("/vehicle-position")
    public Mono<String> getVehiclePosition() {
        var monoData = vehicleService.getData();

//        Mono<String> mono = monoData
//                        .map(bytes -> new String(bytes, StandardCharsets.UTF_8));
        monoData.subscribe(result -> LOGGER.info("This is the result -> : " +result));
        return vehicleService.getData();

    }

}
