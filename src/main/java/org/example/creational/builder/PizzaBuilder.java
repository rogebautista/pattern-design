package org.example.creational.builder;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }

    public PizzaBuilder setCrust(String crust) {
        pizza.setCrust(crust);
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        pizza.addTopping(topping);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}

