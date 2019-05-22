package dao;

import entity.Product;
import entity.ProductDao;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    List<Product> products;
    public ProductDaoImpl() {
        this.products = new ArrayList<Product>();
    }
    public ProductDaoImpl(List<Product> products) {
        this.products = products; //konstruktor parametrowy
    }
    public List<Product> getAllProduct() {
        return products;
    }

}
