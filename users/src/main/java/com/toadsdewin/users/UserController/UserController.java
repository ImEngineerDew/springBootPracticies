package com.toadsdewin.users.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.toadsdewin.users.UserService.*;
import com.toadsdewin.users.UserModel.*;
import java.util.ArrayList;

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
    
}
