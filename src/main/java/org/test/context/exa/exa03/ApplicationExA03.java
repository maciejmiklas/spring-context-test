package org.test.context.exa.exa03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Same as exa01, but BeanB comes from external config class: ConfBeanB
 * <p>
 * Spring loads bean definitions from imported configuration in a first place.
 */
class ApplicationExA03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
