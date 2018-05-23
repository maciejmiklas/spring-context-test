package org.test.context.exc.exc05;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfBeanA.class, ConfBeanB.class, ConfBeanC.class})
@Configuration
class Conf {


}
