package com.aaron.teluskoprac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // for rest services use @ RestController
public class HomeController {
    Integer count=0;
    @RequestMapping("home")
//    @ResponseBody
    public String home()
    {
        String res=(++count).toString();
        System.out.println("home() function called in Controller Class with freq: "+res);
        return "home.jsp";

    }
}
