package com.example.conditionalonbeanorder;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

    @Bean
    @ConditionalOnBean(BeanB.class)
    BeanA beanA(BeanB beanB) {
        return new BeanA(beanB);
    }

    @Bean
    @ConditionalOnProperty("b.enabled")
    BeanB beanB() {
        return new BeanB();
    }
}
