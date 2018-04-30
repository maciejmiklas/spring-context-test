package org.test.context.ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Same as ex01, but BeanB comes from external config class: ConfBeanB
 * <p>
 * Spring loads bean definitions from local configuration in a first place, after that it processes the imports,
 * assuming thad there are no dependencies between beans.
 */
@SpringBootApplication
@Import(Conf.class)
class ApplicationEx03 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEx03.class, args);
    }
}
