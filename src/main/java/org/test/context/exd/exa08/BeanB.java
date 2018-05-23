package org.test.context.exd.exa08;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanB {

    public BeanB() {
        log("BeanB - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanB - postConstruct");
    }

    public void method() {
        log("BeanB - method");
    }
}
