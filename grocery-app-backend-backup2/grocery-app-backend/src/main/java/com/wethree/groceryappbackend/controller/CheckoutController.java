package com.wethree.groceryappbackend.controller;

import org.springframework.web.bind.annotation.*;

import com.wethree.groceryappbackend.entity.Purchase;
import com.wethree.groceryappbackend.entity.PurchaseResponse;
import com.wethree.groceryappbackend.service.CheckoutService;

@RestController
@RequestMapping("/api/checkout")
@CrossOrigin(origins="http://localhost:4200")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}
