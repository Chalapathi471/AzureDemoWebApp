package com.example.AzureDemoWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String index(){
        return "Hello Azure WebApp!";
    }

    @RequestMapping("/welcome")
    public String devops(){
        return "Welcome to Azure DevOps!!!!";
    }
}
