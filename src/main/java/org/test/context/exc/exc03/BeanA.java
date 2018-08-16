package org.test.context.exc.exc03;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanA {

    @Autowired
    private BeanC beanC;

    @Autowired
    private BeanB beanB;

    public BeanA() {
        log("BeanA - constructor, beanB:%s, beanC:%s", beanB, beanC);
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct, beanB:%s, beanC:%s", beanB, beanC);
    }

    public void method() {
        log("BeanA - method");
        beanB.method();
        beanC.method();
    }
}
