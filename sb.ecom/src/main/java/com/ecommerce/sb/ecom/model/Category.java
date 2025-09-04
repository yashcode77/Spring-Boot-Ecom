package com.ecommerce.sb.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="categories")
public class Category {
    @Id
    private long CategoryId;
    private String CategoryName;

    public Category(long categoryId, String categoryName) {
        this.CategoryId = categoryId;
        this.CategoryName = categoryName;
    }

    public Category() {

    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        this.CategoryId = categoryId;
    }
}
