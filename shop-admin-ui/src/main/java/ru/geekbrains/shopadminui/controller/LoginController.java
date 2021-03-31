package ru.geekbrains.shopadminui.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/login")
    public String showMyLoginPage() {
        logger.info("Авторизация");
        return "modern-login";
    }
}