package org.test.context.exc.exc03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Similar to exc02 but this time we've renamed method ConfBeanC#beanC() into ConfBeanC#beanB(), so that we have two
 * methods beanB and not as it was in exc02 two methods with name: beanC
 * <p>
 * The output is still the same, BeanB is missing.
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
