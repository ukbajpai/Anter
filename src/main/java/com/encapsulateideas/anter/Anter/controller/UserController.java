package com.encapsulateideas.anter.Anter.controller;

import java.util.List;

import com.encapsulateideas.anter.Anter.Repo.IpCameraRepo;
import com.encapsulateideas.anter.Anter.Repo.UserRepo;
import com.encapsulateideas.anter.Anter.model.IpCamera;
import com.encapsulateideas.anter.Anter.model.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/")
public class UserController {

    private UserRepo userRepo;
    private IpCameraRepo camRepo;

    public UserController(UserRepo repo, IpCameraRepo camRepo){
        this.userRepo = repo;
        this.camRepo = camRepo;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object authenticateLogin(@RequestBody User user){
        final var getuser = userRepo.findByUuid(user.getUuid());
        if(getuser.getPassword().equals(user.getPassword())){
            return "Got IT!!!! ";
        }
        return "You Screwed it :(";
    }

     @RequestMapping(value = "/createlogin", method = RequestMethod.GET)
    public Object RegisterLogin(@RequestBody User user){
        return userRepo.save(user);
    }

      @RequestMapping(value = "/getcam", method = RequestMethod.GET)
    public List<IpCamera> getIPCam(){
        return camRepo.findAll();
    }

    @RequestMapping(value = "/savecam", method = RequestMethod.POST)
    public Object saveIpCamera(@RequestBody IpCamera camera){
        return camRepo.save(camera);
    }

}
