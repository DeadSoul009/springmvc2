package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UserController {

    @RequestMapping("/greeting")
    public ModelAndView greet(HttpServletRequest request, HttpServletResponse response)
    {

        String name=request.getParameter("t1");
        User us=new User();
        us.setName(name);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("viewpage.jsp");
        mv.addObject("result",us.getName());
        return mv;
    }
}
