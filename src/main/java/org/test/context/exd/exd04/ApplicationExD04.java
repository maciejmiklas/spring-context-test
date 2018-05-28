package org.test.context.exd.exd04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import static org.test.context.Log.log;

/**
 * Same as exd03, but @Lazy has been removed on injection point.
 *
 * BeanB is not lazy any more, @Lazy on bean definition is not enough.
 */
@Import(Conf.class)
class ApplicationExD04 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
