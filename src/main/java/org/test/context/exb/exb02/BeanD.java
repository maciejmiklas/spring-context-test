package org.test.context.exb.exb02;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanD {

    public BeanD() {
        log("BeanD - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanD - postConstruct");
    }

    public void method() {
        log("BeanD - method");
    }
}
