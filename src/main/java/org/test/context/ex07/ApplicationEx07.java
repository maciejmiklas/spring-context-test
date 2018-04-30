package org.test.context.ex07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import static org.test.context.Log.log;

/**
 * Same as ex06, but @Lazy has been removed on injection point.
 *
 * BeanB is not lazy any more, @Lazy on bean definition is not enough.
 */
@SpringBootApplication
@Import(Conf.class)
class ApplicationEx07 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApplicationEx07.class, args);

        log("Call BeanA");
        BeanA beanA = context.getBean(BeanA.class);
        beanA.method();
    }
}
