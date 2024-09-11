package com.moneytracker.DTO;

import com.moneytracker.Entity.UserEntity;

public class UserDTO {

    private Integer id;
    private String name;
    private Double amount;
    private String transactionName;

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public UserEntity toEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setName(name);
        userEntity.setAmount(amount);
        userEntity.setTransactionName(transactionName);

        return userEntity;
    }

    public UserDTO(Double amount, Integer id, String name, String transactionName) {
        this.amount = amount;
        this.id = id;
        this.name = name;
        this.transactionName = transactionName;
    }
}
