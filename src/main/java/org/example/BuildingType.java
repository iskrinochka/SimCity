package org.example;

public abstract class BuildingType implements ShowInfo {
    protected String name;
    protected int price;
    protected String symbol;

    public BuildingType(String name, int price, String symbol) {
        this.name = name;
        this.price = price;
        this.symbol = symbol;
    }

    @Override
    public String showInfo() {
        return (name + " " + symbol + " " + price + "$");
    }
}
