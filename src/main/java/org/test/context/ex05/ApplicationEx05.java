package org.test.context.ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Same as ex04, but BeanA does not have @DependsOn("beanB"), instead BeanA injects BeanB
 * <p>
 * Spring creates instance of BeanA, during construction phase (constructor) references to BeanB are not set. Once the
 * instance of BeanA is created, BeanB will be created and injected to BeanA. BeanA cannot access BeanB in constructor,
 * first after full initialization is done - method @PostConstruct
 */
@SpringBootApplication
@Import(Conf.class)
class ApplicationEx05 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEx05.class, args);
    }
}
