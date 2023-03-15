package com.rianzesh.learnspring;

import com.rianzesh.learnspring.cycle.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connex () {
        return new Connection();
    }
}
