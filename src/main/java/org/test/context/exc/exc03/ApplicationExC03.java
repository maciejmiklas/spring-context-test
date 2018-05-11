package org.test.context.exc.exc03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exc01, but factory method ConfBeanB#beanB has been renamed to ConfBeanB#beanC
 * <p>
 * Spring does not create BeanB because there are two factory methods with the same name and only first will get called
 */
class ApplicationExC03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
