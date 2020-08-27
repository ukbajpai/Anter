package com.encapsulateideas.anter.Anter.Repo;

import com.encapsulateideas.anter.Anter.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String>{
    public User findByUuid(String uuid);
}
