package org.test.context.exa.exa03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Same as exa01, but BeanB comes from external config class: ConfBeanB
 * <p>
 * Spring loads bean definitions from local configuration in a first place, after that it processes the imports,
 * assuming thad there are no dependencies between beans.
 */
class ApplicationExA03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
