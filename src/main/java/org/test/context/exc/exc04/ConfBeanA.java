package org.test.context.exc.exc04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanA {

    @Bean
    BeanA beanA() {
        return new BeanA();
    }
}
