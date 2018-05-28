package org.test.context.exc.exc02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * The same as exc01, but we've renamed factory method ConfBeanB#beanB() into ConfBeanB#beanC().
 * <p>
 * In order to find out all possible bean definitions Spring goes over our @Import declaration, which is:
 * ConfBeanA, ConfBeanB, ConfBeanC. There are two factory methods with the same name: ConfBeanB#beanC() and
 * ConfBeanC#beanC(), so ConfBeanC overwrites bean created trough ConfBeanB, because it creates bean with the same name.
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
