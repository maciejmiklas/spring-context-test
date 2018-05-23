package org.test.context.exd.exa07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exa06, but BeanB is lazy. @Lazy is set on injection point and bean definition. Additionally we have defined
 * method on BeanA that calls method on BeanB: ApplicationEx06 -> beanA.method() ->  beanB.method()
 * <p>
 * Spring postpones creation of BeanB until method is being called on it, @Lazy works as expected.
 */
class ApplicationExA07 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
