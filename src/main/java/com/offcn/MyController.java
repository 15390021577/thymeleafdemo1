package com.offcn;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * @Auther: James
 * @Dater: 2020/10/22 0022 09:51
 * 座右铭：动手一遍胜过看一百遍
 * @Description:
 */
@Controller
public class MyController {
    @RequestMapping("/index")
    public String index(Model model){
        System.out.println("==========");
        String message = "hello thymeleaf";
        model.addAttribute("message",message);
        System.out.println("hello------------");
        System.out.println("又添加一个输出1111111111111111111");

        return "index";
    }
    @RequestMapping("/getuser")
    public String getUser(Model model){
        User user = new User(1,"lucy",18);
        model.addAttribute("user",user);
        Map<String,Object> map = new HashMap();
        map.put("src1","4.jpg");
        map.put("src2","5.jpg");
        model.addAttribute("s",map);
        return "index2";
    }
    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> list = new ArrayList<User >();
        list.add(new User(1,"lucy",18));
        list.add(new User(2,"jack",28));
        list.add(new User(3,"tom",19));
        list.add(new User(4,"tim",38));
        model.addAttribute("userList",list);
        return "index3";
    }
    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","老彭");
        model.addAttribute("href","http://www.baidu.com");
        return "index4";
    }
    @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","y");
        model.addAttribute("menu","admin");
        model.addAttribute("manage","manage");
        return "index5";
    }
    @RequestMapping("/index6")
    public String index6(){
        System.out.println("in index6....");
        return "index6";
    }
    @RequestMapping("/index7")
    public String index7(Model model){
      //日期
        Date date = new Date();
        model.addAttribute("date",date);
        //数字的格式化
        model.addAttribute("num",1234.5678);
        //字符串的
        String str= "2020-10-22 11:45:48.243  INFO 8800 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index\n" +
                "2020-10-22 11:45:48.376  INFO 8800 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''\n" +
                "2020-10-22 11:45:48.386  INFO 8800 --- [           main] com.offcn.ThymeleafdemoApplication       : Started ThymeleafdemoApplication in 1.999 seconds (JVM running for 2.754)\n" +
                "2020-10-22 11:45:52.941  INFO 8800 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'\n" +
                "2020-10-22 11:45:52.941  INFO 8800 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'\n" +
                "2020-10-22 11:45:52.945  INFO 8800 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet   ";
        model.addAttribute("str",str);
        //字符串截取
        String str2 = "java-offcn-0615";
        model.addAttribute("str2",str2);
        return "index7";
    }
}
