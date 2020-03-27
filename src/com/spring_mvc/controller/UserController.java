package com.spring_mvc.controller;

import com.spring_mvc.entity.Address;
import com.spring_mvc.entity.User;
import com.spring_mvc.entity.UserMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;


//使用@Controller注解申明这是一个基于Annotation的控制器类
//使用@RequestMapping(value="", **args)指明请求url及请求方法等
@Controller
@RequestMapping(value = "/user")
// 使用@SessionAttributes()注解将User类型的模型数据存入HttpSession中
//@SessionAttributes(value = {"user"})
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

    //添加getUser()方法，实现将请求参数绑定到控制方法的Map对象，并遍历对象同时输出控制台
    @RequestMapping(value = "/getUser")
    public String getUser(UserMap userMap){
        Set set = userMap.getUserMap().keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object keyName = iterator.next();
            User user = userMap.getUserMap().get(keyName);
            System.out.println(user);
        }
        return "redirect:/user/resSuccess";
    }

    //添加userMap首页，跳转userMap页面
    @RequestMapping(value = "/usermap")
    public ModelAndView userMao(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "userMap");
        modelAndView.setViewName("userMap");
        return modelAndView;
    }

    // 添加前往returnTypeRequest.jsp页面的方法
    @RequestMapping(value = "/returnReq")
    public ModelAndView returnReq(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "返回类型请求页");
        // 设置逻辑地址，通过spring-MVC.xml中的视图解析器将逻辑视图转换为物理视图
        modelAndView.setViewName("returnTypeRequest");
        return modelAndView;
    }

    // 添加returnReqStatus()方法
    @RequestMapping(value = "/returnReqStatus")
    public ModelAndView 添加returnReqStatus(){
        String viewname = "returnTypeRequestStatus";
        ModelAndView modelAndView = new ModelAndView(viewname);
        User user = new User();
        user.setUsername("我是傻逼");
        user.setPassword("vermouth");
        user.setAddress(new Address("重庆", "南川"));
        modelAndView.addObject("msg", user);
        System.out.println(user);
        return modelAndView;
    }

    // 添加sessionAttributesIndex()方法，访问添加sessionAttributesIndex
    @RequestMapping(value = "/sessionAttributesIndex")
    public ModelAndView sessionAttributesIndex(){

        //实例化ModelAndView对象，返回视图名及模型数据
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "sessionAttributesIndex测试首页");
        modelAndView.setViewName("sessionAttributesIndex");
        return modelAndView;

    }
    // 添加sessionAttributes()方法,将模型数据保存到HttpSession中,使用@SessionAttributes()注解
    @RequestMapping(value = "/sessionAttributes")
    public String sessionAttributes(ModelMap modelMap){
        User user = new User();
        user.setUsername("天帝");
        user.setPassword("vermouth");
        user.setAddress(new Address("重庆", "南川"));
        modelMap.put("user", user);
        return "sessionAttributesRes";
    }

    // 添加getUser()方法,作为在控制器类方法执行之前执行的方法,使用@ModelAttribute注解来标识
    @ModelAttribute
    public User getUser(Model model){
        User user = new User();
        user.setUsername("啊嘞嘞");
        user.setPassword("哦嘎西索");
        user.setAddress(new Address("杯户", "神奈川"));
        model.addAttribute("user", user);
        return user;
    }

    // 添加访问ModelAttribute首页方法
    @RequestMapping(value = "/modelAttributeIndex")
    public ModelAndView modelAttributeIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "ModelAttribute测试首页");
        modelAndView.setViewName("modelAttribute");
        return modelAndView;
    }

    // 添加modelAttribute()方法
    @RequestMapping(value = "/modelAttribute")
    public String modelAttribute(User user){
        System.out.println(user);
        return "success";
    }

    // 添加jsonIndex()方法
    @RequestMapping(value = "jsonIndex")
    public ModelAndView jsonIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jsonIndex");
        return modelAndView;
    }

    // 添加returnJson()方法,返回json格式数据
    @ResponseBody
    @RequestMapping(value = "/returnJson")
    public Collection<User> returnJson(){
        Map<Integer, User> userMap = new HashMap<>();
        userMap.put(1, new User("王磊", "vermouth", new Address("重庆", "南川")));
        userMap.put(2, new User("刘宇", "love", new Address("重庆", "丰都")));
        userMap.put(3, new User("李柯", "future", new Address("重庆", "丰都")));
        userMap.put(4, new User("李丞豪", "future", new Address("重庆", "南川")));
        return userMap.values();
    }
}
