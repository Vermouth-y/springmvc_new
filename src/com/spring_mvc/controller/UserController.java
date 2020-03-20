package com.spring_mvc.controller;

import com.spring_mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



//使用@Controller注解申明这是一个基于Annotation的控制器类
//使用@RequestMapping(value="", **args)指明请求url及请求方法等
@Controller
@RequestMapping(value = "/user")
public class UserController {
    //添加saveUser()方法，将控制器方法绑定到表单对象User中
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(User user){
        System.out.println(user);
        //创建ModelAndView 对象，返回视图名，模型名称及模型对象
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据，可以是任何Pojo对象
        modelAndView.addObject("msg", user);
        //设置逻辑视图名，通过spring-MVC.xml中设置的视图解析器将此处的逻辑视图名转换为物理视图名
        modelAndView.setViewName("userShow");
        return modelAndView;
    }

    //添加user()方法，请求带有user表单的首页
    @RequestMapping(value = "/user")
    public ModelAndView user(){
        System.out.println("创建ModelAndView对象,返回视图名及模型名称及模型对象" + "\n");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "用户管理");
        modelAndView.setViewName("user");
        return modelAndView;
    }
}
