package org.test.context.exd.exd01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * We have here three beans A, B, C, there are no dependencies between them. BeanC is being defined trough dedicated configuration class.
 * <p>
 * Nothing special here, initialisation order is as expected.
 */
class ApplicationExD01 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
