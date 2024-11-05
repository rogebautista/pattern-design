package org.example.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String crust;
    private List<String> toppings = new ArrayList<>();

    public void setSize(String size) { this.size = size; }
    public void setCrust(String crust) { this.crust = crust; }
    public void addTopping(String topping) { toppings.add(topping); }

    @Override
    public String toString() {
        return "Pizza [Size: " + size + ", Crust: " + crust +
                ", Toppings: " + String.join(", ", toppings) + "]";
    }
}


