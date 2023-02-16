package com.user.userlogin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

  User u1 = new User();

    @GetMapping("/index")
    public String homePage(){
        return "index";
    }

   @GetMapping(path = "signIn")
   public String signPage(Model model){
     model.addAttribute("user", new User()); // this user will be added to the form th:object
       return "signIn";
   }

   @GetMapping(path = "userlist")
   public String userlist(Model model){
    model.addAttribute("user", u1);
     return "userlist";
   }
  

 @PostMapping(path="processlogin")
 public String processlogin(@ModelAttribute User user){
  u1 = user;
     System.out.println(u1.email);
     System.out.println(u1.password);
     return "signIn";
 }


 @GetMapping(path = "signUp")
 public String signuppage(){
   return "signUp";
 }
}
