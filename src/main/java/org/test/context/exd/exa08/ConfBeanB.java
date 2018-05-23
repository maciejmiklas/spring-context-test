package org.test.context.exd.exa08;

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
