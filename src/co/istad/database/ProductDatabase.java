package co.istad.database;

import co.istad.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private List<Product> products;
    public ProductDatabase(){
        products = new ArrayList<>();
        products.add(new Product(1,"Coca",2,2500.0, LocalDate.now()));
        products.add(new Product(2,"Pepsi",2,2500.0, LocalDate.now()));
        products.add(new Product(3,"Pencil",2,2500.0, LocalDate.now()));
        products.add(new Product(4,"Book",2,2500.0, LocalDate.now()));
        products.add(new Product(5,"Pen",2,2500.0, LocalDate.now()));
    }
    public List<Product> getProducts(){
        return products;
    }
}
