package com.nuc.parttimejob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PartTimeJobApplication {

    public static void main(String[] args) {
        System.out.println("测试");
        SpringApplication.run(PartTimeJobApplication.class, args);
    }

}
