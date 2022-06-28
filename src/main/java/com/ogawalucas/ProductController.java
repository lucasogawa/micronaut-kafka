package com.ogawalucas;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("products")
public class ProductController {

    @Inject
    private ProductClient client;

    @Get("send/without-parameters")
    public void sendProductWithoutTopicParameters() {
        System.out.println("\nSend - Without Parameters");
        client.sendProduct("Kafka Name", "Kafka Value");
    }

    @Get("send/with-parameters")
    public void sendProductWithTopicParameters() {
        System.out.println("\nSend - With Parameters");
        client.sendProduct("my-products", "Kafka Name", "Kafka Value");
    }
}
