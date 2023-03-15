package com.rianzesh.learnspring;

import com.rianzesh.learnspring.data.Bar;
import com.rianzesh.learnspring.data.Foo;
import com.rianzesh.learnspring.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDI(){
        // Dependency Injection
        Foo foo = context.getBean("fooSecond",Foo.class);
        Bar bar = context.getBean(Bar.class);

        FooBar foobar = context.getBean(FooBar.class);

        Assertions.assertSame(foo, foobar.getFoo());
        Assertions.assertSame(bar, foobar.getBar());
    }

    @Test
    void testNoDI(){
        // Manual without Dependency Injection
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo,fooBar.getFoo());
        Assertions.assertSame(bar,fooBar.getBar());
    }
}
