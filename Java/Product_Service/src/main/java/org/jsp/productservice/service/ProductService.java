package org.jsp.productservice.service;

import java.util.List;

import org.jsp.productservice.entity.ProductEntity;

public interface ProductService {
	
public void saveProductService(ProductEntity entity);
	
	public ProductEntity findProductById(Long id);
	
	public List<ProductEntity> findAllProduct();
	
	public List<ProductEntity> findProductQuantityById(Long id);
	
	public void  deleteProductById(Long id);
	
	public List<ProductEntity> findAllProductSortByName();
	
	public List<ProductEntity> findProductByName(String Name);
	

}

