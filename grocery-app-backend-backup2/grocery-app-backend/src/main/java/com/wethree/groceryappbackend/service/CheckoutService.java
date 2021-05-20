package com.wethree.groceryappbackend.service;

import com.wethree.groceryappbackend.entity.Purchase;
import com.wethree.groceryappbackend.entity.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
