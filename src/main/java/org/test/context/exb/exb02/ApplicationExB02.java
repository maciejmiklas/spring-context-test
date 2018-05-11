package org.test.context.exb.exb02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * Same as exb01 but we've changed configuration's import order from A,B,C into B,A,C.
 * <p>
 * This does not influence beans instantiation order. Class order in @Import has no meaning,
 * <code>@Import({ConfBeanA.class, ConfBeanB.class, ConfBeanC.class})</code>
 * and <code>@Import({ConfBeanB.class, ConfBeanA.class, ConfBeanC.class})</code> have the same result.
 */
class ApplicationExB02 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
