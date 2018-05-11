package org.test.context.exa.exa05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Same as exa04, but BeanB is lazy.
 * <p>
 * Spring ignores @Lazy annotation and load bean without delay.
 */
class ApplicationExA05 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
