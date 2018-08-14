package org.test.context.exa.exa05;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanB {

    @Autowired
    private BeanA beanA;

    public BeanB() {
        log("BeanB - constructor: %s", beanA);
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanB - postConstruct: %s", beanA);
    }
}
