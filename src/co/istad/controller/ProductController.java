package co.istad.controller;

import co.istad.model.Product;
import co.istad.service.ProductService;
import co.istad.service.ProductServiceImpl;
import co.istad.utils.Singleton;
import co.istad.view.ProductView;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private ProductService productService;
    private Scanner scanner;
    public ProductController(){
        productService = new ProductServiceImpl();
        scanner = Singleton.scanner();
    }
    public void index(){
        List<Product> products = productService.select();
        ProductView.printProductList(products);
    }
    public void createProduct(){
        System.out.print("Enter Product name : ");
        String name = (scanner.nextLine());
        System.out.print("Enter Product price : ");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Product qty : ");
        Integer qty = Integer.parseInt(scanner.nextLine());

        Product products = new Product();
        products.setName(name);
        products.setPrice(price);
        products.setQty( qty );
        productService.insert( products );
        System.out.println("--> Product has been add successfully..!");
    }
    public void updateById(){

        System.out.print("Enter ID to Update : ");
        Long updateId = Long.parseLong(scanner.nextLine());
        System.out.print("Enter Product name : ");
        String name = (scanner.nextLine());
        System.out.print("Enter Product price : ");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Product qty : ");
        Integer qty = Integer.parseInt(scanner.nextLine());

        Product products = new Product();
        products.setId(updateId);
        products.setName(name);
        products.setPrice(price);
        products.setQty( qty );
        productService.updateById( products );
        System.out.println("--> Product has been update successfully..!");
    }

    public void deleteById(){
        System.out.print("Enter Product ID You want to delete : ");
        Long deleteId = Long.parseLong(scanner.nextLine());
        productService.deleteById(deleteId);
        System.out.println("--> Product has been delete successfully..!");
    }
}
