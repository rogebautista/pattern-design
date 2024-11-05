package org.example.creational.builder;

public class PizzaDirector {
    public static Pizza buildMargherita(PizzaBuilder builder) {
        return builder.setSize("Medium")
                .setCrust("Thin Crust")
                .addTopping("Mozzarella")
                .addTopping("Basil")
                .addTopping("Tomato Sauce")
                .build();
    }

    public static Pizza buildMeatLovers(PizzaBuilder builder) {
        return builder.setSize("Large")
                .setCrust("Stuffed Crust")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Bacon")
                .addTopping("Mozzarella")
                .build();
    }

    public static Pizza buildVeggieDelight(PizzaBuilder builder) {
        return builder.setSize("Small")
                .setCrust("Regular Crust")
                .addTopping("Bell Peppers")
                .addTopping("Onions")
                .addTopping("Mushrooms")
                .addTopping("Olives")
                .addTopping("Mozzarella")
                .build();
    }
}