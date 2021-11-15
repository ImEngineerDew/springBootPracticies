package com.toadsdewin.StudentRelated.repositories;
import com.toadsdewin.StudentRelated.models.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  StudentRepository extends CrudRepository<StudentModel,Long>
{

}
