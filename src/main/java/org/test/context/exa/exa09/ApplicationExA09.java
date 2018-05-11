package org.test.context.exa.exa09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exa07, but @Lazy has been removed from bean configuration.
 * <p>
 * BeanB is not lazy any more, @Lazy on bean definition is not enough.
 * Lazy annotation has to be provided on configuration and all injection points, otherwise spring eagerly initializes such bean.
 */
class ApplicationExA09 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
