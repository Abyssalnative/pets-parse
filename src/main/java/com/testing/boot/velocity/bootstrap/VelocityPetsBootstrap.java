package com.testing.boot.velocity.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.testing.boot.velocity")
public class VelocityPetsBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(VelocityPetsBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
