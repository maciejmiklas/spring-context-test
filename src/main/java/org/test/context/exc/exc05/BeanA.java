package org.test.context.exc.exc05;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanA {

    @Autowired
    private BeanC beanC;

    @Autowired
    private BeanB beanB;

    public BeanA() {
        log("BeanA - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct");
    }

    public void method() {
        log("BeanA - method");
        beanB.method();
        beanC.method();
    }
}
