package org.test.context.exa.exa06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Same as exa05, but BeanA does not have @DependsOn("beanB"), instead BeanA injects BeanB
 * <p>
 * Spring creates instance of BeanA, during construction phase (constructor) references to BeanB are not set. Once the
 * instance of BeanA is created, BeanB will be created and injected to BeanA. BeanA cannot access BeanB in constructor,
 * first after full initialization is done - method @PostConstruct
 */
class ApplicationExA05 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
