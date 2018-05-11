package org.test.context.exb.exb05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exb01, but configuration class ConfBeanB has been renamed to ConfBeanXB
 * <p>
 * Instantiation order has changed form: D, A, B, C to: D, A, C, B.
 */
class ApplicationExB05 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
