package org.hillel.hwspringsecurity.service;

import java.util.List;
import org.hillel.hwspringsecurity.model.Product;

public interface ProductService {
  List<Product> findAllProducts();

  Product saveProduct(Product product);

  Product findProductById(Integer id);

  void deleteProduct(Integer id);
}
