package org.test.context.exc.exc02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exc02, but configuration class ConfBeanC has been renamed to ConfBeanAC
 * <p>
 * Spring does not create BeanC and not BeanB as it was the case in exc02. The reason for this is that we've renamed
 * configuration and Spring created beans in another order.
 */
class ApplicationExC02 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
