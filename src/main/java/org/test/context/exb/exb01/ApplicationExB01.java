package org.test.context.exb.exb01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * BeanA, BeanB and BeanC are created trough dedicated configuration class: ConfBeanA, ConfBeanB and ConfBeanC.
 * <p>
 * Beans are created in order: A, B, C. However ist for now unclear why.
 */
class ApplicationExB01 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
