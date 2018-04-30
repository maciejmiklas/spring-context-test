package org.test.context.ex06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
class ConfBeanB {

    @Bean
    @Lazy
    BeanB beanB() {
        return new BeanB();
    }
}
