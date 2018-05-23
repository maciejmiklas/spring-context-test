package org.test.context.exd.exa05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;

@Import({ConfBeanB.class})
@Configuration
class Conf {

    @Bean
    @DependsOn("beanB")
    BeanA beanA() {
        return new BeanA();
    }

    @Bean
    BeanC beanC() {
        return new BeanC();
    }
}
