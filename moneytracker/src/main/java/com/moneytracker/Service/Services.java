package com.moneytracker.Service;

import com.moneytracker.DTO.UserDTO;
import com.moneytracker.Entity.UserEntity;

import java.util.List;

public interface Services {

     void addData (UserDTO userDTO);
     List<UserEntity> getData();
     UserEntity getTransaction (String id);

}
