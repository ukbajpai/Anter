package com.encapsulateideas.anter.Anter.Repo;

import com.encapsulateideas.anter.Anter.model.IpCamera;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IpCameraRepo extends MongoRepository<IpCamera, String>{

}
