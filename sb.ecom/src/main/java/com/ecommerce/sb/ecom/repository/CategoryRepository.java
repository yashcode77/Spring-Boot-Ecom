package com.ecommerce.sb.ecom.repository;

import com.ecommerce.sb.ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
