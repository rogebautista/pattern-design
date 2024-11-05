package org.example.creational.builder;

public class BuilderPattern {
    public static void main(String[] args) {
        PizzaBuilder builder = new PizzaBuilder();

        Pizza margherita = PizzaDirector.buildMargherita(builder);
        System.out.println(margherita);

        builder = new PizzaBuilder();
        Pizza meatLovers = PizzaDirector.buildMeatLovers(builder);
        System.out.println(meatLovers);

        builder = new PizzaBuilder();
        Pizza veggieDelight = PizzaDirector.buildVeggieDelight(builder);
        System.out.println(veggieDelight);
    }
}
