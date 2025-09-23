package com.ecommerce.sb.ecom.repository;

import com.ecommerce.sb.ecom.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(@NotBlank @Size(min=5,message="Category name must contain at least 5 characters") String categoryName);
}
