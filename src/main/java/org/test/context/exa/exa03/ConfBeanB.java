package org.test.context.exa.exa03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanB {

    @Bean
    BeanB beanB() {
        return new BeanB();
    }
}
