package org.hillel.hwspringsecurity.repository;

import org.hillel.hwspringsecurity.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
