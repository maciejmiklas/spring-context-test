package org.test.context.ex06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import static org.test.context.Log.log;

/**
 * Same as ex05, but BeanB is lazy. @Lazy is set on injection point and bean definition. Additionally we have defined
 * method on BeanA that calls method on BeanB: ApplicationEx06 -> beanA.method() ->  beanB.method()
 * <p>
 * Spring postpones creation of BeanB until method is being called on it, @Lazy works as expected.
 */
@SpringBootApplication
@Import(Conf.class)
class ApplicationEx06 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApplicationEx06.class, args);

        log("Call BeanA");
        BeanA beanA = context.getBean(BeanA.class);
        beanA.method();
    }
}
