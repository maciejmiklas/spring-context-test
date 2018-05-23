package org.test.context.exd.exa07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanC {

    @Autowired
    @Lazy
    private BeanB beanB;

    public BeanC() {
        log("BeanC - constructor: %s", beanB);
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanC - postConstruct");
    }

    public void method() {
        log("BeanC - method");
        beanB.method();
    }
}
