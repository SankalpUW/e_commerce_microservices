package com.sankalp.ecommerce.notification;

import java.math.BigDecimal;

import com.sankalp.ecommerce.payment.PaymentMethod;

public record PaymentNotificationRequest(
        String orderReference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerFirstname,
        String customerLastname,
        String customerEmail
) {
}
