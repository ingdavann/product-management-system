package co.istad.dao;

import co.istad.model.Product;
import org.w3c.dom.ls.LSInput;

import java.util.List;
import java.util.Optional;

public interface ProductDao {

    // CRUD = Create, Read, Update, Delete
    Product insert(Product product);
    List<Product> select();
    Optional<Product> selectById(Long id);
    Product updateById(Product product);
    Product deleteById(Long id);
    List<Product> selectByName(String name);
}
