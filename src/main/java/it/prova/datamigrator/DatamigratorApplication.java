package it.prova.datamigrator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatamigratorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DatamigratorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
