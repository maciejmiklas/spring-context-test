package org.test.context.exb.exb06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exb01 but BeanC had been injected into BeanA.
 * <p>
 * The instantiation order has been changed, because BeanC had to be created before BeanA
 */
class ApplicationExB06 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
