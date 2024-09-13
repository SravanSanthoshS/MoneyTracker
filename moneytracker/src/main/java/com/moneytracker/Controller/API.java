package com.moneytracker.Controller;

import com.moneytracker.DTO.UserDTO;
import com.moneytracker.Entity.UserEntity;
import com.moneytracker.Repository.UserRepository;
import com.moneytracker.Service.ServiceImplementation;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class API {

    @Autowired
    private ServiceImplementation serviceImplementation;


    @GetMapping
    public ResponseEntity<List<UserEntity>> getData(){
       if(serviceImplementation.getData() == null){return null;}
       return new ResponseEntity<>(serviceImplementation.getData(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<String> addData(@RequestBody UserDTO user) {
        serviceImplementation.addData(user);
        System.out.println("hii");
        return new ResponseEntity<>("posted", HttpStatus.OK);
    }

    @GetMapping("/{transactionName}")
    public ResponseEntity<UserEntity> getByTransactionName(@PathVariable String transactionName){
        return new ResponseEntity<>(serviceImplementation.getTransaction(transactionName), HttpStatus.OK);
    }

}
