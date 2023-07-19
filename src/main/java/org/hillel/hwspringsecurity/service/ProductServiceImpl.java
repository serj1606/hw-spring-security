package org.hillel.hwspringsecurity.service;

import lombok.AllArgsConstructor;
import org.hillel.hwspringsecurity.exeption.NoSuchProductException;
import org.hillel.hwspringsecurity.model.Product;
import org.hillel.hwspringsecurity.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public List<Product> findAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public Product saveProduct(Product product) {
    productRepository.save(product);
    return product;
  }

  @Override
  public Product findProductById(Integer id) {
    Optional<Product> optional = productRepository.findById(id);
    if (optional.isEmpty()) {
      throw new NoSuchProductException("There is no product with ID = " + id + " in Database.");
    }
    return optional.get();
  }

  @Override
  public void deleteProduct(Integer id) {
    productRepository.deleteById(id);
  }
}
