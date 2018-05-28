package org.test.context.exd.exd05;

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
