package org.test.context.excd.excd01;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

import static org.test.context.Log.log;

class BeanA implements MyInterface {

    @Autowired
    private List<MyInterface> impls;

    public BeanA() {
        log("BeanA - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct, MyInterface size: %d", impls.size());
    }

    public void method() {
        log("BeanA - method, MyInterface size: %d", impls.size());
    }
}
