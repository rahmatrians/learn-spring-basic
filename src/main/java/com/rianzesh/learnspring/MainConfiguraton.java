package com.rianzesh.learnspring;

import com.rianzesh.learnspring.configuration.BarConfiguration;
import com.rianzesh.learnspring.configuration.FooConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FooConfiguration.class, BarConfiguration.class})
@Slf4j
public class MainConfiguraton {
    MainConfiguraton(){
        log.info("MainConfiguration was called!");
    }
}