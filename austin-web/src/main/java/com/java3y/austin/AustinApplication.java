package com.java3y.austin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author 3y
 */
@SpringBootApplication
public class AustinApplication {
    public static void main(String[] args) {
        // TODO apollo的ip/port【must】
        System.setProperty("apollo.config-service", "http://127.0.0.1:7000");
        ConfigurableApplicationContext context = SpringApplication.run(AustinApplication.class, args);
        System.out.println(context);
    }
}
