package com.codeWhithProjects.ecom.services.admin.category;

import com.codeWhithProjects.ecom.dto.CategoryDto;
import com.codeWhithProjects.ecom.entity.Category;

public interface CategoryService {
    Category createCategory(CategoryDto categoryDto);

}
