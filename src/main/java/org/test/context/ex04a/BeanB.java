package org.test.context.ex04a;

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
}
