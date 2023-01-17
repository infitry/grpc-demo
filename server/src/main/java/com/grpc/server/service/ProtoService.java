package com.grpc.server.service;

import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ProtoService {

    public String protoTest() {
        return "test";
    }
}
