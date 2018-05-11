package org.test.context.exb.exb01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanB {

    @Bean
    BeanB beanB() {
        return new BeanB();
    }
}
