package com.example.restapispringboot.database;

import com.example.restapispringboot.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Integer>
                                                //Entity, Type_PrimaryKey
{

}
