package org.jsp.productservice.serviceimp;

import java.util.List;

import org.jsp.productservice.entity.ProductEntity;
import org.jsp.productservice.repository.ProductRepositoryImp;
import org.jsp.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductRepositoryImp productRepositoryImp;
	
	@Override
	public void saveProductService(ProductEntity entity) {
		productRepositoryImp.saveProduct(entity);

	}

	@Override
	public ProductEntity findProductById(Long id) {
		return productRepositoryImp.findProductById(id);
	}

	@Override
	public List<ProductEntity> findAllProduct() {
		return productRepositoryImp.findAllProduct();
	}

	@Override
	public List<ProductEntity> findProductQuantityById(Long id) {
		return productRepositoryImp.findProductQuantityById(id);
	}

	@Override
	public void deleteProductById(Long id) {
		 productRepositoryImp.deleteProductById(id);;
	}

	

	@Override
	public List<ProductEntity> findAllProductSortByName() {
		return productRepositoryImp.findAllProductSortByName();
	}

	@Override
	public List<ProductEntity> findProductByName(String Name) {
		return productRepositoryImp.findProductByName(Name);
	}
	
	public double findProductPriceByProductId(long productId) 
	{
		return productRepositoryImp.findProductPriceByProductId(productId);
	}
}
