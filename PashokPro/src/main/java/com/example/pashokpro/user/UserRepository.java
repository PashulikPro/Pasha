package com.example.pashokpro.user;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    //   public int countById(Integer id);


}