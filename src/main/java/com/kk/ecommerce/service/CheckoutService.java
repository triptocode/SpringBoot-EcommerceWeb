package com.kk.ecommerce.service;

import com.kk.ecommerce.dto.Purchase;
import com.kk.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
