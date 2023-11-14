package co.istad;

import co.istad.controller.MenuController;
import co.istad.controller.ProductController;
import co.istad.model.Product;
import co.istad.service.ProductService;
import co.istad.service.ProductServiceImpl;
import co.istad.utils.Singleton;
import co.istad.view.MenuView;
import co.istad.view.ProductView;
import com.sun.tools.javac.Main;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    // Object or Instance
    private final Scanner scanner;
    private final MenuController menuController;
    private final ProductController productController;
    public MainApplication(){
        scanner = Singleton.scanner();
        menuController = Singleton.menuController();
        productController = Singleton.productController();
    }
    private void run(){
        System.out.println("Welcome to PMS");
        menuController.index();
        boolean condition = false;
        do {
            System.out.print("Please Choose One Option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1 ->{
                    productController.index();
                }
                case 2 ->{
                    productController.createProduct();
                }
                case 3 -> {
                    productController.updateById();
                }
                case 4 -> {
                    productController.deleteById();
                }
                default -> throw new IllegalArgumentException("No Option Invalid");
            }
        }while (true);

    }
    public static void main(String[] args) {
        new MainApplication().run();
    }
}
