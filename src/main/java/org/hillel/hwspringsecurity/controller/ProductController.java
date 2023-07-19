package org.hillel.hwspringsecurity.controller;

import lombok.AllArgsConstructor;
import org.hillel.hwspringsecurity.model.Product;
import org.hillel.hwspringsecurity.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
  private ProductService productService;

  @GetMapping
  public List<Product> showAllOrders() {
    return productService.findAllProducts();
  }

  @GetMapping("/{id}")
  public Product showOrderById(@PathVariable Integer id) {
    return productService.findProductById(id);
  }

  @DeleteMapping("/{id}")
  public String deleteProduct(@PathVariable Integer id) {
    productService.deleteProduct(id);
    return "Product with id = " + id + " was deleted from DB";
  }

  @PostMapping
  public Product addNewProduct(@RequestBody Product product) {
    return productService.saveProduct(product);
  }
}
