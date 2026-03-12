package org.example;

import org.example.StatePattern.OrderState;
import org.example.StrategyPattern.TaxStrategy;

public class Order {

    private OrderState state;
    private TaxStrategy taxStrategy;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculatePrice(double price) {
        return price + taxStrategy.calculate(price);
    }

    public void process() {
        state.handle();
    }
}
