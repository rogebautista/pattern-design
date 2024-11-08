package org.example.structural.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add milk and sugar to the coffee
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Another coffee with different configuration
        Coffee houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.getCost());
    }
}

