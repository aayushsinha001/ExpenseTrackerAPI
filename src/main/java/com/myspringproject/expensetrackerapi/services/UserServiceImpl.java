package com.myspringproject.expensetrackerapi.services;

import com.myspringproject.expensetrackerapi.domain.User;
import com.myspringproject.expensetrackerapi.exceptions.EtAuthException;
import com.myspringproject.expensetrackerapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        if (email != null) {
            email = email.toLowerCase();
        }
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public User registerUser(String first, String lastName, String email, String password) throws EtAuthException {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if (email != null) email = email.toLowerCase();
        if (!pattern.matcher(email).matches())
            throw new EtAuthException("Invalid Email format");
        Integer count = userRepository.getCountByEmail(email);
        if (count > 0)
            throw new EtAuthException("Email already in use");
        Integer userId = userRepository.create(first, lastName, email, password);
        return userRepository.findByUserId(userId);
    }
}
