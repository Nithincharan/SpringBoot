package com.demo.SpringBootWeb1;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller  ///managed by spring at the back by converting into servlet working in tomcat servers.
public class HomeController {
    @RequestMapping("/")  ///to call the home method we have to map the index.jsp to return it.
    public String home(){
        System.out.println("home method called");

        return "index";   /// spring doesn't support the .jsp file so we have to add tomcat jasper <dependency> in pom.xml file to convert it ito servlet.
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelAndView modelAndView){  ///we are using the modelAndView object here now which is an interface which has the data
///request param is used when we don't want to specify the same variable name i.e num1 or num2 here
       int result = a + b ;
       modelAndView.addObject("result", result);
       modelAndView.setViewName("result");

        return modelAndView;
    }


}
