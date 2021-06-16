package com.dcs.platform.user;

import com.dcs.platform.exceptions.EmailAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;


@Component
public class UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers(){
        return usersRepository.findAll();
    }

    public void addNewUsers(Users users) {
        //Business logic here : check if email already exists or not
        Optional<Users> usersOptional = usersRepository.findUsersByEmail(users.getEmail());

        if(usersOptional.isPresent()){
            try {
                throw new EmailAlreadyExistException();
            } catch (EmailAlreadyExistException e) {
                e.printStackTrace();
            }
        }
        System.out.println(users);
        usersRepository.save(users);
    }
}
