package com.ecommerce.sb.ecom.model;

public class Category {
    private long CategoryId;
    private String CategoryName;

    public Category(long categoryId, String categoryName) {
        this.CategoryId = categoryId;
        this.CategoryName = categoryName;
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
