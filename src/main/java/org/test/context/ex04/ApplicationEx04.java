package org.test.context.ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Same as ex03, but BeanA has @DependsOn("beanB")
 * <p>
 * Spring starts loading beans from "main" configuration class, however BeanA has dependency on BeanB, and in this case
 * dependent bean has to be loaded in a first place, it does not matter where it's located, Spring will scan all
 * possible configurations to locate it.
 */
@SpringBootApplication
@Import(Conf.class)
class ApplicationEx04 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEx04.class, args);
    }
}
