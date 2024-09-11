package com.moneytracker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserEntity {
    @Id
    private Integer id;
    private String name;
    private Double amount;
    private String transactionName;

}
