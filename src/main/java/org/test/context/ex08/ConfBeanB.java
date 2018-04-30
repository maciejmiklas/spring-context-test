package org.test.context.ex08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanB {

    @Bean
   // @Lazy
    BeanB beanB() {
        return new BeanB();
    }
}
