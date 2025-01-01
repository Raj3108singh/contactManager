package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page controller");
        model.addAttribute("name", "Learn Spring boot");
        return "home";

    }

    // about
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        return "about";
    }
    // services

    @RequestMapping("/services")
    public String servicesPage() {
        return "services";
    }
}
