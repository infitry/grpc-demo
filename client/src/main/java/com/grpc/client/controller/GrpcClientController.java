package com.grpc.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @GetMapping
    public String test() {
        return "";
    }
}
