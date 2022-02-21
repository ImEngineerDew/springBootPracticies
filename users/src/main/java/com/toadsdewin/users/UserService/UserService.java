package com.toadsdewin.users.UserService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.toadsdewin.users.UserRepository.UserRepository;
import com.toadsdewin.users.UserModel.*;

@Service
public class UserService 
{
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers()
    {
        return (ArrayList<UserModel>)userRepository.findAll();
    }

    public UserModel saveUser(UserModel user)
    {
        return userRepository.save(user);
    }
}
