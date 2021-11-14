package com.toadsdewin.practiceOne.controllers;
import com.toadsdewin.practiceOne.models.usersModel;
import com.toadsdewin.practiceOne.repositories.usersRepository;
import com.toadsdewin.practiceOne.services.usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/user")
public class usersController
{
    @Autowired
    usersService userService;

    @GetMapping
    public ArrayList<usersModel> getUser ()
    {
        return userService.getUser();
    }

    @PostMapping()
    public usersModel saveUser(@RequestBody usersModel user)
    {
        return userService.setUser(user);
    }

    @GetMapping(path ="/{id}")
    public Optional <usersModel> getID(@PathVariable ("id") Long id)
    {
        return userService.getUserID(id);
    }

    @GetMapping(path ="/{name}")
    public usersModel getName(@PathVariable ("name") String name)
    {
        return userService.getUserName(name);
    }

}