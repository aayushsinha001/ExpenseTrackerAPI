package com.myspringproject.expensetrackerapi.repositories;

import com.myspringproject.expensetrackerapi.domain.User;
import com.myspringproject.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findByUserId(Integer userdId);

}
