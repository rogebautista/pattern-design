package org.example.structural.decorator;

class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 1.50;
    }
}

class HouseBlend implements Coffee {
    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double getCost() {
        return 1.00;
    }
}
