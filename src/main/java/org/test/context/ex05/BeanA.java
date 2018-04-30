package org.test.context.ex05;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanA {

    @Autowired
    private BeanB beanB;

    public BeanA() {
        log("BeanA - constructor: %s", beanB);
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct: %s", beanB);
    }
}
