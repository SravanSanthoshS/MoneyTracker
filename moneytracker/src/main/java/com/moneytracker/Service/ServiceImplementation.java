package com.moneytracker.Service;

import com.moneytracker.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation implements Services{

    @Autowired
    private UserRepository userRepository;

    
}
