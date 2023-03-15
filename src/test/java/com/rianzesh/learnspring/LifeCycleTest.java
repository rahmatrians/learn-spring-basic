package com.rianzesh.learnspring;

import com.rianzesh.learnspring.cycle.Connection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ApplicationContext context;
    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @Test
    void testConnection() {
        Connection getConnect = context.getBean(Connection.class);
    }
}
