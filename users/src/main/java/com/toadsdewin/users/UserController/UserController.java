package com.toadsdewin.users.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.toadsdewin.users.UserService.*;
import com.toadsdewin.users.UserModel.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList <UserModel> getUsers()
    {
        return userService.getUsers();
    }
    
    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user)
    {
        return this.userService.saveUser(user);
    }
    
    @GetMapping(path = "/{id}")
    public Optional <UserModel> getUserById(@PathVariable("id") long ID)
    {
        return this.userService.obtainByID(ID);
    }
    
    /*Obtain a data by name /users/query?name=""*/
    @GetMapping("/query")
    public ArrayList<UserModel> getUserByName(@RequestParam("name")String name)
    {
        return this.userService.obtainByName(name);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteByID(@PathVariable("id") long ID)
    {
        boolean isEliminated = this.userService.deleteUser(ID);

        if(isEliminated)
        {
            return "The user has been deleted with ID: "+ID;
        }
        else
        {
            return "It doesn't been eliminated with ID: "+ID;
        }
    }    
}
