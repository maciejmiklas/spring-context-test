package org.test.context.exb.exb03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanB {

    @Bean
    BeanB xyz() {
        return new BeanB();
    }
}
