package org.test.context.exa.exa01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ApplicationExA01 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Conf.class);
        ctx.refresh();
    }
}
