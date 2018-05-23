package org.test.context.exa.exa02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Same as exa01, but beans in configuration are defined in different order.
 * <p>
 * Method order within class matters, not the method names. However this could depend on java version/vendor.
 */
class ApplicationExA02 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
