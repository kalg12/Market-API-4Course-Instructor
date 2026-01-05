package com.fulltech.market;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*We are adding an annotation called: RestController and RequestMapping*/
@RestController
@RequestMapping("/say")

public class HelloWorldController {
    /* We are creating our method called: sayHello*/
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello everybody!";
    }
}