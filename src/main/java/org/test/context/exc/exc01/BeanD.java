package org.test.context.exc.exc01;

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
