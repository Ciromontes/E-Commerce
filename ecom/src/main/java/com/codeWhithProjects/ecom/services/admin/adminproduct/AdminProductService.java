package com.codeWhithProjects.ecom.services.admin.adminproduct;

import com.codeWhithProjects.ecom.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface AdminProductService {
    ProductDto addProduct(ProductDto productDto) throws IOException;
    List<ProductDto> getAllProducts();

    List<ProductDto>getAllProductByName(String name);
}
