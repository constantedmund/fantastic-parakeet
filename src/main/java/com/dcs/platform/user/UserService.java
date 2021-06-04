package com.dcs.platform.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Component
public class UserService {


    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "edmund",
                        "ced@mail.com",
                        150,
                        true,
                        LocalDate.of(1985, Month.SEPTEMBER,23)

                )
        );
    }
}
