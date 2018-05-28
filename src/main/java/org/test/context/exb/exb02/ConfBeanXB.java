package org.test.context.exb.exb02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanXB {

    @Bean
    BeanB beanB() {
        return new BeanB();
    }
}
