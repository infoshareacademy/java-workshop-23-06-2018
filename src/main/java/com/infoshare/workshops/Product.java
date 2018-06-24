package com.infoshare.workshops;

public class Product {
    private int id;
    private String name;
    private int amount;
    private double vatRate;
    private double grossPricePerUnit;

    public Product(int id, String name, int amount, double vatRate, double grossPricePerUnit){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.vatRate = vatRate;
        this.grossPricePerUnit = grossPricePerUnit;
    }

    @Override
    public String toString(){
        return "identyfikator: " + id + ", nazwa: " + name + ", ilość: "
        + amount + ", stawka VAT: " + vatRate + ", cena brutto: " + grossPricePerUnit;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getVatRate() {
        return vatRate;
    }

    public double getGrossPricePerUnit() {
        return grossPricePerUnit;
    }
}
