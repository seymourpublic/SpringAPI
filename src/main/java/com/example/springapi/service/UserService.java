package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(List<User> userList) {
        this.userList = userList;
    }

    public UserService(){
        this.userList = userList;
        userList = new ArrayList<>();

        User user1 = new User(1,"exp", 32, "exp@gmail.com");

        userList.addAll(Arrays.asList(user1));
    }


    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for(User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
