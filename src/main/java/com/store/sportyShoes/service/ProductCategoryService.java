package com.store.sportyShoes.service;

import java.util.List;


import com.store.sportyShoes.model.ProductCategory;


public interface ProductCategoryService {
	public ProductCategory getCategoryById(Long id);
	public void updateCategory(ProductCategory category);
	
	public ProductCategory saveCategory(ProductCategory category);
	public void deleteCategory(Long id) ;
	public List<ProductCategory> fetchProductCategoryList();
	 
}

