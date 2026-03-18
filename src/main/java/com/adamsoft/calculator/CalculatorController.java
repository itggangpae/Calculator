package com.adamsoft.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CalculatorController{
    private final Calculator calculator;

    @RequestMapping("/")
    public String index(){
        return "health check";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return String.valueOf(calculator.sum(num1, num2));
    }
}
