package com.dheerajapp.springredisexample.ProductController;

import com.dheerajapp.springredisexample.entity.Product;
import com.dheerajapp.springredisexample.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControl{

    @Autowired
    ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product){
        return productDao.save(product);
    }

    @GetMapping
    public List<Object> getAllProduct(){
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id){
        return productDao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id){
        return productDao.deleteProduct(id);
    }


}
