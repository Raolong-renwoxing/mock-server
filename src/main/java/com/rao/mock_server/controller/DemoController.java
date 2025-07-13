package com.rao.mock_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("one")
    public String one(){
        return "one";
    }

    @GetMapping("two")
    public String two(String input ){
        if(Objects.equals(input, "1")){
            return "1";
        }
        else if (Objects.equals(input,"2")){
            return "2";
        }
        else {
            return "demo";
        }
    }
}
