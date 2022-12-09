package com.store.sportyShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.store.sportyShoes.model.ProductCategory;

@Repository
public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Long >{

}
