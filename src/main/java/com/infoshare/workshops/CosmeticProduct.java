package com.infoshare.workshops;

import java.time.LocalDateTime;

public class CosmeticProduct extends Product {
    private LocalDateTime expirationDate;

    public CosmeticProduct(int id, String name, int amount, double vatRate,
                           double grossPricePerUnit, LocalDateTime expirationDate) {
        super(id, name, amount, vatRate, grossPricePerUnit);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", data ważności: " + expirationDate;
    }
}