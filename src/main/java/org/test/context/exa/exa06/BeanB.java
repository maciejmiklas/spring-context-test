package org.test.context.exa.exa06;

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
