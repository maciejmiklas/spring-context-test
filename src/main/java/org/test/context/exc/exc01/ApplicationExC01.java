package org.test.context.exc.exc01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * BeanA, BeanB and BeanC are created trough dedicated configuration class: ConfBeanA, ConfBeanB and ConfBeanC.
 * BeanA injects BeanB and BeanC.
 */
class ApplicationExC01 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
