package com.toadsdewin.springboot.fundamentos.Repository;
import com.toadsdewin.springboot.fundamentos.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{

}
