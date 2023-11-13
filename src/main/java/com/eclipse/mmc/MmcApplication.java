package com.eclipse.mmc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MmcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MmcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("kjnkjbnkjn");
    }
}
