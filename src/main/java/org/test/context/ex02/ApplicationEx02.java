package org.test.context.ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Same as ex01, but beans in configuration are defined in different order.
 * <p>
 * Method placement within class matters, not the method names. However this could depend on java version/vendor.
 */
@SpringBootApplication
@Import(Conf.class)
class ApplicationEx02 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEx02.class, args);
    }
}
