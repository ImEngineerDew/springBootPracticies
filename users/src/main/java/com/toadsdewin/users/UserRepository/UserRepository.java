package com.toadsdewin.users.UserRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.toadsdewin.users.UserModel.*;
import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository <UserModel, Long> {
    public abstract ArrayList<UserModel> findByName(String name);
    
}
