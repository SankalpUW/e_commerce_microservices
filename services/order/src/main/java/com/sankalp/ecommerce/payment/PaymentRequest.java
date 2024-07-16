package com.sankalp.ecommerce.payment;

import java.math.BigDecimal;

import com.sankalp.ecommerce.customer.CustomerResponse;
import com.sankalp.ecommerce.order.PaymentMethod;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
