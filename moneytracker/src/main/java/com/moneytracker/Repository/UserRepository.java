package com.moneytracker.Repository;

import com.moneytracker.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {


    UserEntity findByTransactionName(String transactionName);

}
