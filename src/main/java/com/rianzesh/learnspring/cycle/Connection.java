package com.rianzesh.learnspring.cycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {
    @Bean
    public void afterPropertiesSet() throws Exception {
        log.info("App is running and All beans already set!");
    }

    @Bean
    public void destroy() throws Exception {
        log.info("App gonna stop!");
    }
}
