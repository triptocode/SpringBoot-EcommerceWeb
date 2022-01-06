package com.kk.ecommerce.dto;

import com.kk.ecommerce.entity.Address;
import com.kk.ecommerce.entity.Customer;
import com.kk.ecommerce.entity.Order;
import com.kk.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
