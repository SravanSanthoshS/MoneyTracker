package com.moneytracker.DTO;

import com.moneytracker.Entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {

    private Integer id;
    private String name;
    private String transactionName;
    private Double amount;


    public UserDTO() {

    }

    public static UserEntity toEntity(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setName(userDTO.getName());
        userEntity.setAmount(userDTO.getAmount());
        userEntity.setTransactionName(userDTO.getTransactionName());

        return userEntity;
    }

    public UserDTO( Integer id, String name, String transactionName, Double amount) {
        this.id = id;
        this.name = name;
        this.transactionName = transactionName;
        this.amount = amount;
    }
}
