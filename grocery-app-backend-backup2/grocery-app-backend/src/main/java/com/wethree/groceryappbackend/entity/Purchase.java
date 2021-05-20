package com.wethree.groceryappbackend.entity;

import java.util.Set;

import lombok.Data;

@Data
public class Purchase {
	private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
