package org.test.context.exb.exb05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * The same as exb01 but we've changed configuration's import order from A,B,C into B,A,C.
 * <p>
 * The instantiation order has changed. Spring load classes from @Import from left to the right side.
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
