package com.sample.TestProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Home {

    @GetMapping("/welcome")
    public String welcome()
    {
        String text = "This is a private page";
        return text;
    }
}
