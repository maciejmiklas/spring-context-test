package org.test.context.exb.exb04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfBeanC {

    @Bean
    BeanC beanC() {
        return new BeanC();
    }
}
