package com.toadsdewin.practiceOne.repositories;

import java.util.ArrayList;

import com.toadsdewin.practiceOne.models.usersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends CrudRepository <usersModel,Long>{

    public abstract usersModel findByName(String name);
    
}
