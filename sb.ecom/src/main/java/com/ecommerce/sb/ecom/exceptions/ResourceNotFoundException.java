package com.ecommerce.sb.ecom.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String field;
    String fieldName;

    public ResourceNotFoundException() {
    }

    Long fieldId;
    public ResourceNotFoundException(String resourceName, String field, String fieldName) {
        super(String.format("Resource %s not found with %s: %s", resourceName, field, fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundException(String resourceName, String field, Long fieldId) {
        super(String.format("Resource %s not found with %s: %s", resourceName, field, fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId = fieldId;
    }

}
