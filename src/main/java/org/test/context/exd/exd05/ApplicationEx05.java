package org.test.context.exd.exd05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exd03, but @Lazy has been removed from bean configuration.
 * <p>
 * BeanB is not lazy any more, @Lazy on bean definition is not enough.
 */
class ApplicationEx05 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
