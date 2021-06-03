package com.example.restapispringboot.controller;

import com.example.restapispringboot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.restapispringboot.database.PersonRepo;
@Controller
public class PersonController {

    @Autowired   // will go and find an instantiatied object of PersonRepo Interface
    PersonRepo repo;
    @RequestMapping("/")
    public String home()
    {
        return "home.jsp";
    }

    @RequestMapping("/addPerson")
    public String addPerson(Person person) // This function will be called on pressing submit button on form
    {
        System.out.println(person);
        repo.save(person);
        return "home.jsp";
    }
}
