package com.example.payment_service.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {

    @Test
    void processCartShouldExist() {
        PaymentService paymentService = new PaymentService();

        assertDoesNotThrow(() -> paymentService.processCart(null));
    }

}
