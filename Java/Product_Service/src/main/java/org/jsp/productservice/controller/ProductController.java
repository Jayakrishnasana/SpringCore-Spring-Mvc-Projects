package org.jsp.productservice.controller;

import java.util.List;

import org.jsp.productservice.entity.ProductEntity;
import org.jsp.productservice.serviceimp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	
	@Autowired
	private ProductServiceImp productServiceImp;

	@RequestMapping(value = "/saveProductDetails")
	public ModelAndView save(ProductEntity productEntity) {
		System.out.println(productEntity);
		productServiceImp.saveProductService(productEntity);
		return new ModelAndView("index.jsp");
		
	}
	
	
	@RequestMapping(value = "/getById")
	public ModelAndView getById(ProductEntity productEntity) {
		productServiceImp.findProductById(productEntity.getAltkey());
		System.out.println(	productServiceImp.findProductById(productEntity.getAltkey()));
		return new ModelAndView("index.jsp");
	}
	
	
	@RequestMapping(value = "/deleteById")
	public ModelAndView deleteById(ProductEntity productEntity) {
		productServiceImp.deleteProductById(productEntity.getAltkey());
		System.out.println(productEntity);
		return new ModelAndView("delete.jsp");
	}
	
	@RequestMapping(value="/allProduct")
	public List<ProductEntity> findAllProduct() {
		System.out.println("helooooo");
		System.out.println(productServiceImp.findAllProduct());
		return productServiceImp.findAllProduct();
	}
	
	@RequestMapping(value="/getQuantityById")
	public ModelAndView getProductQuantityById(ProductEntity productEntity) {
		
		System.out.println("hiiiiiiiii");
		return new ModelAndView("index1.jsp");
		
		
	}
}
