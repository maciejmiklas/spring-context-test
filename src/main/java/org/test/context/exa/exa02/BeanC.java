package org.test.context.exa.exa02;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanC {

    public BeanC() {
        log("BeanC - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanC - postConstruct");
    }
}
