package org.test.context.exa.exa05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Same as exa04, but BeanA does not have @DependsOn("beanB"), instead BeanA injects BeanB
 * <p>
 * We have logically similar dependency situation to exa4: BanA depends on BeanB. However @PostConstruct are
 * called in different order: Spring creates instance of BeanA, during construction phase (constructor) references to
 * BeanB are not set. Once the instance of BeanA is created, BeanB will be created and injected to BeanA. BeanA cannot
 * access BeanB in constructor, first after full initialization is done - method @PostConstruct.
 * <p>
 * Spring had to modify order of @PostConstruct calls, to ensure that bean references are not null during initialisation phase.
 */
class ApplicationExA05 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
