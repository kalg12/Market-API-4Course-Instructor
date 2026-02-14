package com.fulltech.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")


public class GettingAnOperation {
    @GetMapping("/sum")
    public Number getSum(){
        return 5+5;
    }
}
