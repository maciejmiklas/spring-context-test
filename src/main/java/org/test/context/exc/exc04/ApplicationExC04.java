package org.test.context.exc.exc04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Similar to exc02, but we've changed import order for config classes from
 * <code>@Import({ConfBeanA.class, ConfBeanB.class, ConfBeanC.class})</code> to
 * <code>@Import({ConfBeanA.class, ConfBeanC.class, ConfBeanB.class})</code>
 * <p>
 * Now ConfBeanB will get scanned on the end and it overwrites previous bean with the same name.
 */
class ApplicationExC04 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
