package org.test.context.exc.exc06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * The same as exc02, there are two factory methods: beanC. Additionally BeanB and BeanC are implementing common interface.
 * Now BeanA does not inject directly BeanB and BeanC, but it inject collection of beans implementing our interface.
 * <p>
 * In case of direct injection one of the beans was missing, now both are there!
 */
class ApplicationExC06 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
