package org.test.context.exc.exc05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.test.context.Log.log;

/**
 * It's a modified exc02. We've set AllowBeanDefinitionOverriding to false on Application Context.
 * <p>
 * Bean overwriting is disabled now, so instead of bean not found we are getting exception that we are trying to
 * register two bean under the same name.
 */
class ApplicationExC05 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.setAllowBeanDefinitionOverriding(false);
        ctx.register(Conf.class);
        ctx.refresh();

        log("Call BeanA");
        BeanA beanA = ctx.getBean(BeanA.class);
        beanA.method();
    }
}
