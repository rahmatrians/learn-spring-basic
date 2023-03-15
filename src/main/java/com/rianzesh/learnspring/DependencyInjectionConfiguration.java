package com.rianzesh.learnspring;

import com.rianzesh.learnspring.data.Bar;
import com.rianzesh.learnspring.data.Foo;
import com.rianzesh.learnspring.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean
    public Bar barSecond(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo,bar);
    }
}
