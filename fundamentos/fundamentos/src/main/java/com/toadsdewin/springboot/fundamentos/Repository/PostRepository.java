package com.toadsdewin.springboot.fundamentos.Repository;
import com.toadsdewin.springboot.fundamentos.Entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Posts,Long> {
}
