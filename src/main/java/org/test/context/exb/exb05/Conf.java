package org.test.context.exb.exb05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfBeanA.class, ConfBeanXB.class, ConfBeanC.class})
@Configuration
class Conf {

    @Bean
    BeanD beanD() {
        return new BeanD();
    }

}
