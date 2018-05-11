package org.test.context.exb.exb05;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanA {

    public BeanA() {
        log("BeanA - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct");
    }

    public void method() {
        log("BeanA - method");
    }
}
