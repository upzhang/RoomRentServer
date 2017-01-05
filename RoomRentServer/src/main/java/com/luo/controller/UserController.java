package com.luo.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.luo.domain.User;
import com.luo.service.UserService;

@Controller  
public class UserController {  
	private Logger logger = Logger.getLogger(UserController.class);
	
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/index*")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }    
    
    @RequestMapping(value="/test",method=RequestMethod.GET) @ResponseBody
    public void test(HttpServletRequest req, HttpServletResponse resp){     
    	logger.debug("test start.");
    	logger.debug(req.getAttribute("x"));
    	logger.debug(req.getParameter("x"));
    	
    	try {
			resp.getOutputStream().write("xxxx".getBytes());
			resp.getOutputStream().flush();
			resp.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
}  
