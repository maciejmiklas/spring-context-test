package org.test.context.exc.exc02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanB {

    @Bean
    BeanB beanC() {
        return new BeanB();
    }
}
