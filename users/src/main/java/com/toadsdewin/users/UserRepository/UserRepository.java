package com.toadsdewin.users.UserRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.toadsdewin.users.UserModel.*;

@Repository
public interface UserRepository extends CrudRepository <UserModel, Integer> {
    
}
