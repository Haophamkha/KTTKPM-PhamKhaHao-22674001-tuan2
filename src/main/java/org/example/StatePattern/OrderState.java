package org.example.StatePattern;

import org.example.Order;

public interface OrderState {
    void handle(Order order);
}