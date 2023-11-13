package com.eclipse.mmc;

import com.eclipse.mmc.controllers.PaysController;
import com.eclipse.mmc.services.impl.PaysServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MmcApplication  implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(MmcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }

    }
