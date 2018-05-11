package org.test.context.exc.exc03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanAC {

    @Bean
    BeanC beanC() {
        return new BeanC();
    }
}
