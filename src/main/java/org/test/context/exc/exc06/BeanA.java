package org.test.context.exc.exc06;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

import static org.test.context.Log.log;

class BeanA {

    @Autowired
    private List<MyInterface> beans;

    public BeanA() {
        log("BeanA - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct");
    }

    public void method() {
        log("BeanA - method");
        beans.forEach(b -> b.method());
    }
}