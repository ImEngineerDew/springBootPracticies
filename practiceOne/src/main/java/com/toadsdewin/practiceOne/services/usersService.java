package com.toadsdewin.practiceOne.services;

import java.util.ArrayList;
import java.util.Optional;

import com.toadsdewin.practiceOne.models.usersModel;
import com.toadsdewin.practiceOne.repositories.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usersService 
{
    @Autowired
    usersRepository userRepository;
    
    public ArrayList<usersModel> getUser ()
    {
        return (ArrayList <usersModel>) userRepository.findAll();
    }
    
    public usersModel setUser(usersModel user)
    {
        return userRepository.save(user);
    }

    public Optional <usersModel> getUserID(Long id)
    {
        return userRepository.findById(id);
    }

    public usersModel getUserName(String name)
    {
        return userRepository.findByName(name);
    }

    
}
