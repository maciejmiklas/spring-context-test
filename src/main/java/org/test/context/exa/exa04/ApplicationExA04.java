package org.test.context.exa.exa04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Same as exa03, but BeanA has @DependsOn("beanB")
 * <p>
 * Spring starts loading beans from "main" configuration class, however BeanA has dependency on BeanB, and in this case
 * dependent bean has to be loaded in a first place, it does not matter where it's located, Spring will scan all
 * possible configurations to locate it.
 */
class ApplicationExA04 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
