package org.jsp.productservice.repository;


import java.util.List;

import org.jsp.productservice.entity.ProductEntity;


public interface ProductRepository {
	
	public void saveProduct(ProductEntity entity);
	
	public ProductEntity findProductById(Long id);
	
	public List<ProductEntity> findAllProduct();
	
	public List<ProductEntity> findProductQuantityById(Long id);
	
	public void  deleteProductById(Long id);
	
	public List<ProductEntity> findProductByName(String Name);
	
	public List<ProductEntity> findAllProductSortByName();
	
	public Double findProductPriceByProductId(long productId);
		


}

