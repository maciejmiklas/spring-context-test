package org.test.context.exb.exb04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfBeanA.class, ConfBeanB.class, ConfBeanC.class})
@Configuration
class Conf {

    @Bean
    BeanD beanD() {
        return new BeanD();
    }

}
