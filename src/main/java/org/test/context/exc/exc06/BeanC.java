package org.test.context.exc.exc06;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanC implements MyInterface {

    public BeanC() {
        log("BeanC - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanC - postConstruct");
    }

    @Override
    public void method() {
        log("BeanC - method");
    }
}
