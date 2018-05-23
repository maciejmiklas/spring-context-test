package org.test.context.exc.exc04;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfBeanA.class, ConfBeanC.class, ConfBeanB.class})
@Configuration
class Conf {

}
