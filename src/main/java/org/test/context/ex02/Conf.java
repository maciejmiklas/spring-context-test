package org.test.context.ex02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Conf {

    @Bean
    BeanB beanB() {
        return new BeanB();
    }

    @Bean
    BeanA beanA() {
        return new BeanA();
    }

    @Bean
    BeanC beanC() {
        return new BeanC();
    }
}
