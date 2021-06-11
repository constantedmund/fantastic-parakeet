package com.dcs.platform.user;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UsersConfig {

    @Bean
    CommandLineRunner commandLineRunner (UsersRepository repository){
        return  args -> {
            Users edmund = new Users(
                    1L,
                    "edmund",
                    "ced@mail.com",
                    150,
                    true,
                    LocalDate.of(1985, Month.SEPTEMBER,23)

            );

            Users alex = new Users(
                    1L,
                    "alex",
                    "alex@mail.com",
                    90,
                    true,
                    LocalDate.of(1985, Month.SEPTEMBER,29)

            );
            repository.saveAll(List.of(edmund,alex));
        };
    }
}
