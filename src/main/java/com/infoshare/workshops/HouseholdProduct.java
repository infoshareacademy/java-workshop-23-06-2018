package com.infoshare.workshops;

public class HouseholdProduct extends Product {
    private boolean customisable;

    public HouseholdProduct(int id, String name, int amount, double vatRate,
                            double grossPricePerUnit, boolean customisable) {
        super(id, name, amount, vatRate, grossPricePerUnit);
        this.customisable = customisable;
    }

    public boolean isCustomisable() {
        return customisable;
    }

    @Override
    public String toString() {
        return super.toString() + " możliwość modyfikacji: " + customisable;
    }
}
