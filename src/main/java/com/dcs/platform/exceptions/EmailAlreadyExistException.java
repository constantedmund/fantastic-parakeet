package com.dcs.platform.exceptions;

public class EmailAlreadyExistException extends Exception {

    @Override
    public String toString(){
        return ("Email already taken");
    }
}
