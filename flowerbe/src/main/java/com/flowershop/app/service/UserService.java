package com.flowershop.app.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowershop.app.entity.Biodata;
import com.flowershop.app.entity.User;
import com.flowershop.app.model.CreateUserRequest;
import com.flowershop.app.model.WebResponse;
import com.flowershop.app.repository.BiodataRepository;
import com.flowershop.app.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BiodataRepository biodataRepository;

    // Create--------------------------------------------------------------------
    public WebResponse create(CreateUserRequest request){
        Biodata biodata = request.getBiodata();
        biodata.setCreatedBy(1L);
        biodata.setCreatedOn(new Date());
        biodata.setIsDelete(false);

        User users = request.getUsers();
        users.setCreatedBy(1L);
        users.setCreatedOn(new Date());
        users.setIsDelete(false);

        biodataRepository.save(biodata);
        userRepository.save(users);
        return null;
    }

    // Read----------------------------------------------------------------------

    // Update--------------------------------------------------------------------

    // Delete--------------------------------------------------------------------
}
