package org.test.context.ex04a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Same as ex04, but BeanB is lazy.
 * <p>
 * Spring ignores @Lazy annotation and load bean without delay.
 */
@SpringBootApplication
@Import(Conf.class)
class ApplicationEx04a {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEx04a.class, args);
    }
}
