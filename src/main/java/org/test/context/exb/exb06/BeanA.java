package org.test.context.exb.exb06;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanA {

    @Autowired
    BeanC beanC;

    public BeanA() {
        log("BeanA - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct");
    }

    public void method() {
        log("BeanA - method");
        beanC.method();
    }
}
