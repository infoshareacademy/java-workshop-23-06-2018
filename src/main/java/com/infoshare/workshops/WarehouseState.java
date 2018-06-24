package com.infoshare.workshops;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class WarehouseState {
    private ArrayList<Product> products = new ArrayList<>();

    public void init(){
        Product myProduct = new Product(1, "Lodówka", 800, 0.23,
                1300);
        FoodProduct kefir = new FoodProduct(2, "Kefirek", 20,
                0.23, 1.5, LocalDateTime.of(2018, 11,
                5, 20, 15));
        CosmeticProduct cream = new CosmeticProduct(3, "Krem", 35,
                0.23, 200,
                LocalDateTime.of(2020, 1, 30, 22, 0));
        HouseholdProduct washingMachine = new HouseholdProduct(4, "Pralka",
                1000, 0.23, 4000, true);
        products.add(myProduct);
        products.add(kefir);
        products.add(cream);
        products.add(washingMachine);
    }

    public void showReport(){
        for(Product product : products){
            System.out.println(product.toString());
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
