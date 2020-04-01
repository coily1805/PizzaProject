package com.emergon.controller;

import com.emergon.model.BreadSize;
import com.emergon.model.Ingredient;
import com.emergon.model.Orders;
import com.emergon.service.BreadSizeService;
import com.emergon.service.IngredientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private BreadSizeService breadSizeService;
    @Autowired
    private IngredientService ingredientService;
    
    @GetMapping
    public String orderForm(Model m) {
        Orders order = new Orders();
        m.addAttribute("order", order);
        return "orderForm";
    }
    
    @ModelAttribute("sizes")
    public List<BreadSize> getSizes(){
        return breadSizeService.findAll();
    }
    
    @ModelAttribute("ingredients")
    public List<Ingredient> getIngredients(){
        return ingredientService.findAll();
    }
    
    

    @PostMapping("/submitOrder")
    public String showOrder(
            @RequestParam("size") String size,
            @RequestParam("ingredients") List<String> ingredients,
            @RequestParam("payment") String payment,
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            Model model) {
        model.addAttribute("size", size);
        model.addAttribute("ingredients", ingredients);
        model.addAttribute("payment", payment);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "showOrder";
    }
}
