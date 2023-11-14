package co.istad.utils;

import co.istad.controller.MenuController;
import co.istad.controller.ProductController;
import co.istad.model.Product;
import co.istad.service.ProductServiceImpl;

import java.util.Scanner;

public class Singleton {
    // 1. Create static reference type
    private static Scanner scanner;
    private static MenuController menuController;
    private static ProductController productController;
    private static ProductServiceImpl productServiceImpl;
    private static Product product;

    public static Product product(){
        if (product == null){
            product = new Product();
        }
        return product;
    }
    // 2. Create get instance of Scanner
    public static Scanner scanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    // 3.
    public static MenuController menuController(){
        if (menuController == null){
            menuController = new MenuController();
        }
        return menuController;
    }
    public static ProductController productController(){
        if(productController == null){
            productController = new ProductController();
        }
        return productController;
    }

    public static ProductServiceImpl getProductServiceImpl(){
        if (productServiceImpl == null){
            productServiceImpl = new ProductServiceImpl();
        }
        return productServiceImpl;
    }
}
