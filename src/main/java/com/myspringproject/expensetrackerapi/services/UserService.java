package com.myspringproject.expensetrackerapi.services;

import com.myspringproject.expensetrackerapi.domain.User;
import com.myspringproject.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String first, String lastName, String email, String password) throws EtAuthException;
}
