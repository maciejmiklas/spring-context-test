package org.test.context.exc.exc02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * The same as exc01, but we've renamed factory method ConfBeanB#beanB() into ConfBeanB#beanC().
 * <p>
 * There are two factory methods with the same name: ConfBeanB#beanC() and ConfBeanC#beanC(). Spring executes only
 * first one so that the second bean is missing. Actually we would expect that BeanC will not be loaded, but its
 * BeanB instead! We've found out in exb05 that names of configuration classes and not factory methods influence loading order,
 * but it does not seams to be a case here, we will discover the reason later on.
 */
class ApplicationExC02 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
