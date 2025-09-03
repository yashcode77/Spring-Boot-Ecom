package com.ecommerce.sb.ecom.service;

import com.ecommerce.sb.ecom.model.Category;

import java.util.List;

public interface CategoryService {

    String deleteCategory(long categoryId);

    List<Category> getAllCategories();
    void createCategory(Category category);
}
