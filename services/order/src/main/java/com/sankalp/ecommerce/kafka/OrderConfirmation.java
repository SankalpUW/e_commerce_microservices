package com.sankalp.ecommerce.kafka;

import java.math.BigDecimal;
import java.util.List;

import com.sankalp.ecommerce.customer.CustomerResponse;
import com.sankalp.ecommerce.order.PaymentMethod;
import com.sankalp.ecommerce.product.PurchaseResponse;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
