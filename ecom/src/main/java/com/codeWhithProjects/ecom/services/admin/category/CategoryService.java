package com.codeWhithProjects.ecom.services.admin.category;

import com.codeWhithProjects.ecom.dto.CategoryDto;
import com.codeWhithProjects.ecom.entity.Category;

import java.util.List;

public interface CategoryService {
    Category createcategory(CategoryDto categoryDto);

    List<Category> getAllCategories();
}