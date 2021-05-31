package com.aaron.teluskoprac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   // for rest services use @ RestController
public class HomeController {
    @RequestMapping("home")
    public ModelAndView home(String name,Integer age)
    {   ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("home.jsp");
        return mv; // If @ResponseBody is commented out then it will search for home.jsp file in webapp folder
    }
}

// ========================================= BASIC REQUEST HANDLING ===================================================

// ============================== Version 4 =====================================
// Model and View
//@Controller   // for rest services use @ RestController
//public class HomeController {
//    @RequestMapping("home")
//    public ModelAndView home(String name,Integer age)
//    {   ModelAndView mv = new ModelAndView();
//        mv.addObject("name",name);
//        mv.addObject("age",age);
//        mv.setViewName("home.jsp");
//        return mv; // If @ResponseBody is commented out then it will search for home.jsp file in webapp folder
//    }
//}

// ============================== Version 3 =====================================
//@RequestMapping("home")
//public String home(@RequestParam("my_name") String name,@RequestParam("my_age") Integer age, HttpSession session)
//// Fields will be extracted by the names mentioned in the Request param field
//{       // For age both Integer and String are working
//    session.setAttribute("name",name);
//    session.setAttribute("age",age);
//
//    // Simple counter to track number of times this api was hit
//    String res=(++count).toString();
//    System.out.println("home() function::Controller Class::freq: "+res);
//    return "home.jsp"; // If @ResponseBody is commented out then it will search for home.jsp file in webapp folder
//}
// ============================== Version 2 =====================================
//         Parameters from the client are being directly matched only with the exact corresponding parameter names
//@RequestMapping("home")
//public String home(String name, Integer age,HttpSession session) // parameter name will be directly matched (name and age)
//{       // For age both Integer and String are working
//    session.setAttribute("name",name);
//    session.setAttribute("age",age);
//
//    // Simple counter to track number of times this api was hit
//    String res=(++count).toString();
//    System.out.println("home() function::Controller Class::freq: "+res);
//    return "home.jsp"; // If @ResponseBody is commented out then it will search for home.jsp file in webapp folder
//}

// ============================== Version 1 =====================================
//@Controller   // for rest services use @ RestController
//public class HomeController {
//    Integer count=0;
//    @RequestMapping("home")
//    //@ResponseBody
//    public String home(HttpServletRequest req)
//    {
//        // Fetching our desired parameters from clients response
//        String name=req.getParameter("name");
//        String age=req.getParameter("age");
//        System.out.println(req);
//        System.out.println(name+" "+age);
//
//        //Storing the fetched data to a session object
//        HttpSession session = req.getSession();
//        session.setAttribute("name",name);
//        session.setAttribute("age",age);
//
//        // Simple counter to track number of times this api was hit
//        String res=(++count).toString();
//        System.out.println("home() function::Controller Class::freq: "+res);
//        return "home.jsp"; // If @ResponseBody is commented out then it will search for home.jsp file in webapp folder
//    }
//}
