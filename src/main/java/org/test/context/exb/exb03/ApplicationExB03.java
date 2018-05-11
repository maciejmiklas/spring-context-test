package org.test.context.exb.exb03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exb01 but factory method in {@link ConfBeanB} has been renamed from beanB to xyz.
 * <p>
 * This change did not influence instantiation order.
 */
class ApplicationExB03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
