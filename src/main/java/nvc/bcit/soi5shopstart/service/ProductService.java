package nvc.bcit.soi5shopstart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.soi5shopstart.model.Product;
import nvc.bcit.soi5shopstart.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    //Get All Products
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    //Get Product By Id
    public Product getById(int id){
        return productRepository.getById(id);
    }
}
