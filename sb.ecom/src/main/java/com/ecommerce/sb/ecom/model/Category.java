package com.ecommerce.sb.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity(name="categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long CategoryId;

    @NotBlank
    @Size(min=5,message="Category name must contain at least 5 characters")
    private String categoryName;

    public Category(long categoryId, String categoryName) {
        this.CategoryId = categoryId;
        this.categoryName = categoryName;
    }
}
