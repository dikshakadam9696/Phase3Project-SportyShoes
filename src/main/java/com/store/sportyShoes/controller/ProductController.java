package com.store.sportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.store.sportyShoes.service.ProductService;

@RestController
public class ProductController {

		@Autowired
		private ProductService productService;
}
