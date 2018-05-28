package org.test.context.exd.exd03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Now we've injected BeanB into BeanA. @Lazy is set on injection point and bean definition. Additionally we have defined
 * method on BeanA that calls method on BeanB: ApplicationExD03 -> beanA.method() ->  beanB.method()
 * <p>
 * Spring postpones creation of BeanB until method is being called on it, @Lazy works as expected.
 */
class ApplicationExD03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
