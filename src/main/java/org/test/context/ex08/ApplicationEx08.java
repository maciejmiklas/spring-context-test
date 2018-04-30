package org.test.context.ex08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import static org.test.context.Log.log;

/**
 * Same as ex06, but @Lazy has been removed from bean configuration.
 * <p>
 * BeanB is not lazy any more, @Lazy on bean definition is not enough.
 * Lazy annotation has to be provided on configuration and all injection points, otherwise spring eagerly initializes a bean.
 */
@SpringBootApplication
@Import(Conf.class)
class ApplicationEx08 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApplicationEx08.class, args);

        log("Call BeanA");
        BeanA beanA = context.getBean(BeanA.class);
        beanA.method();
    }
}
