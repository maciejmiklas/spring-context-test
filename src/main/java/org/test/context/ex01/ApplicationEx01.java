package org.test.context.ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Conf.class)
class ApplicationEx01 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEx01.class, args);
    }
}
