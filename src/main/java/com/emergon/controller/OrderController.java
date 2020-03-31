package com.emergon.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
public class OrderController {
    
    @GetMapping
    public String orderForm(){
        return "orderForm";
    }
    
    @PostMapping("/submitOrder")
    public String showOrder(
    @RequestParam("size") String size,
    @RequestParam("ingredients") List<String> ingredients,
    @RequestParam("payment") String payment,
    @RequestParam("name") String name,
    @RequestParam("age") int age,
    Model model){
        model.addAttribute("size", size);
        model.addAttribute("ingredients", ingredients);
        model.addAttribute("payment", payment);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        System.out.println("size="+size);
        System.out.println("ingredients="+ingredients);
        System.out.println("payment="+payment);
        System.out.println("name="+name);
        System.out.println("age="+age);
        return "showOrder";
    }
}
