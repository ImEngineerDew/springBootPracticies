package com.toadsdewin.users.UserService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.toadsdewin.users.UserRepository.UserRepository;
import com.toadsdewin.users.UserModel.*;

@Service
public class UserService 
{
    @Autowired
    UserRepository userRepository;

    /*Show all users*/
    public ArrayList<UserModel> getUsers()
    {
        return (ArrayList<UserModel>)userRepository.findAll();
    }

    /*Saving an user*/
    public UserModel saveUser(UserModel user)
    {
        return userRepository.save(user);
    }

    public Optional<UserModel> obtainByID(Long ID)
    {
        return userRepository.findById(ID);
    }

    public ArrayList<UserModel> obtainByName(String name)
    {
        return userRepository.findByName(name);
    }

    public boolean deleteUser(Long ID)
    {
        try
        {
            userRepository.deleteById(ID);
            return true;
        }catch(Exception error){
            
            return false;

        }
    }
}
