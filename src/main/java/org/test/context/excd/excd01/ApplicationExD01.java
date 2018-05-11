package org.test.context.excd.excd01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;


class ApplicationExD01 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
