package org.java.lessons.spring.spring_intro1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/options")
    public String options() {
        return "options";
    }

    @GetMapping("/djangoLovers")
    public String django() {
        return "djangoLovers";
    }
}
