package org.test.context.exd.exd02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The same as exd02, but we've annotated BeanB as lazy.
 * <p>
 * Spring does not load BeanB at all, there are no dependencies to that bean.
 */
class ApplicationExD02 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
