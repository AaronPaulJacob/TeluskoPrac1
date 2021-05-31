package com.aaron.teluskoprac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller   // for rest services use @ RestController
public class HomeController {
    Integer count=0;
    @RequestMapping("home")
    //@ResponseBody
    public String home(HttpServletRequest req)
    {
        // Fetching our desired parameters from clients response
        String name=req.getParameter("name");
        String age=req.getParameter("age");
        System.out.println(req);
        System.out.println(name+" "+age);

        //Storing the fetched data to a session object
        HttpSession session = req.getSession();
        session.setAttribute("name",name);
        session.setAttribute("age",age);

        // Simple counter to track number of times this api was hit
        String res=(++count).toString();
        System.out.println("home() function::Controller Class::freq: "+res);
        return "home.jsp"; // If @ResponseBody is commented out then it will search for home.jsp file in webapp folder
    }
}
