package com.emergon.controller;

import com.emergon.model.BreadSize;
import com.emergon.model.Ingredient;
import com.emergon.model.Orders;
import com.emergon.model.Payment;
import com.emergon.service.BreadSizeService;
import com.emergon.service.IngredientService;
import com.emergon.service.OrderService;
import com.emergon.service.PaymentService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IngredientService ingredientService;
    @Autowired
    private BreadSizeService breadSizeService;
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private OrderService orderService;

    @GetMapping()
    public String showOrderForm(Model m) {
        Orders order = new Orders();
        m.addAttribute("order", order);
        return "orderForm";
    }

    @PostMapping("/process")
    public String processOrder(
            @ModelAttribute("order") @Valid Orders order, BindingResult result
    ) {

        if (result.hasErrors()) {
            return "orderForm";
        }
        boolean isSaved = orderService.save(order);
        return "showOrder";
    }

    @ModelAttribute("payments")//ModelAttribute is called before requestMethod and is automatically filled in the Model Object
    public List<Payment> getPayments() {
        return paymentService.findAll();
    }

    @ModelAttribute("ingredients")
    public List<Ingredient> getIngredients() {
        return ingredientService.findAll();
    }

    @ModelAttribute("sizes")
    public List<BreadSize> getBreadSizes() {
        return breadSizeService.findAll();
    }
}
