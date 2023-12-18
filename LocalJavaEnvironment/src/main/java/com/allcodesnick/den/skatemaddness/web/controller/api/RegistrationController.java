package com.allcodesnick.den.skatemaddness.web.controller.api;


import com.allcodesnick.den.skatemaddness.model.User;
import com.allcodesnick.den.skatemaddness.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping
    public String displayRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String createUserAccount(@ModelAttribute("user") User user){
        userService.createUserAccount(user);
        return "redirect:/registration?success";
    }

    @ModelAttribute("user")
    public User userAccount(){
        return new User();
    }

}
