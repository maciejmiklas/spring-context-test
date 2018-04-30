package org.test.context.ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanA {

    @Autowired
    @Lazy
    private BeanB beanB;

    public BeanA() {
        log("BeanA - constructor: %s", beanB);
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct");
    }

    public void method() {
        log("BeanA - method");
        beanB.method();
    }
}
