package com.infoshare.workshops.bonus;

import com.infoshare.workshops.Product;
import com.infoshare.workshops.WarehouseState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductsController {

    @GetMapping("/products")
    public ArrayList<Product> products(){
        WarehouseState state = new WarehouseState();
        state.init();
        return state.getProducts();
    }
}
