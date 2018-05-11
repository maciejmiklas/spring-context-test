package org.test.context.exb.exb04;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanXB {

    public BeanXB() {
        log("BeanXB - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanXB - postConstruct");
    }

    public void method() {
        log("BeanXB - method");
    }
}
