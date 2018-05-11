package org.test.context.exc.exc03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfBeanA.class, ConfBeanB.class, ConfBeanAC.class})
@Configuration
class Conf {

    @Bean
    BeanD bean() {
        return new BeanD();
    }

}
