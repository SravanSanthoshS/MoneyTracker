package com.moneytracker.Service;

import com.moneytracker.DTO.UserDTO;
import com.moneytracker.Entity.UserEntity;
import com.moneytracker.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplementation implements Services{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addData(UserDTO userDTO) {

        UserEntity userEntity = UserDTO.toEntity(userDTO);
        userRepository.save(userEntity);

    }

    @Override
    public List<UserEntity> getData() {

        return userRepository.findAll();
    }

    @Override
    public UserEntity getTransaction(String  transactionName) {
        return userRepository.findByTransactionName(transactionName);

    }


}
