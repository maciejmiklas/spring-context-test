package org.test.context.exa.exa01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Conf {

    @Bean
    BeanA beanA() {
        return new BeanA();
    }

    @Bean
    BeanB beanB() {
        return new BeanB();
    }

    @Bean
    BeanC beanC() {
        return new BeanC();
    }
}
