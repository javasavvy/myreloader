package com.myreloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Justin on 1/29/2015.
 */
@Configuration
@ComponentScan // spring standard component scan
@EnableAutoConfiguration// spring boot autoconfiguration will bootstrap your Spring
//application while attempting to configure the beans you need
// it will also bootstrap an in-memory database if a driver is found
// in the classpath and no datasource is defined
@EnableJpaRepositories // enable jpa for spring
public class MyReloaderApp {
    public static void main (String[] args ) {
        SpringApplication.run(MyReloaderApp.class, args);
    }
}
