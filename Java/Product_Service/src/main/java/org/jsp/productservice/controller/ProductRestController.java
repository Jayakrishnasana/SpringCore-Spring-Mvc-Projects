package org.jsp.productservice.controller;

import java.util.List;

import org.jsp.productservice.entity.ProductEntity;
import org.jsp.productservice.service.ProductService;
import org.jsp.productservice.serviceimp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RestController
public class ProductRestController {
	
	@Autowired
	private ProductServiceImp productServiceImp;
	

	@GetMapping(value = "/findAllProduct")
	public @ResponseBody List<ProductEntity> findAllProduct() {
		System.out.println("helooooo");
		return productServiceImp.findAllProduct();
	}
	
	
	@PostMapping(value="/saveProductDetails")
	public void saveProductDetails( @RequestBody ProductEntity productEntity) {
		System.out.println(productEntity);
		productServiceImp.saveProductService(productEntity);
	}
	
	
	@PostMapping(value = "deleteById/{altkey}")
	public  void deleteById(@PathVariable("altkey") Long id) {
		productServiceImp.deleteProductById(id);
	}
	
	
	@GetMapping(value = "getProductById/{altkey}")
	public ProductEntity getProductById(@PathVariable("altkey") Long id) {
		System.out.println("hiii");
		return productServiceImp.findProductById(id);
	
	}
	
	@GetMapping(value = "/getProductByName")
	public @ResponseBody List<ProductEntity> getProductByName(@RequestParam("name") String name){
		System.out.println(name);
		return  productServiceImp.findProductByName(name);
		
	}
	@GetMapping(value = "getQuantityById")
	public List<ProductEntity> getQuantityById( @RequestParam("id") Long id){
		return productServiceImp.findProductQuantityById(id);
	}
	
	@GetMapping(value = "findAllProductSortByName")
	public @ResponseBody List<ProductEntity> findAllProductSortByName(){
		return productServiceImp.findAllProductSortByName();
	}
	
	
	@GetMapping(value = "/findProductPriceByProductId/{productId}")
	public double findProductPriceByProductId(@PathVariable("productId") long productId) {
		System.out.println("ProductId : "+productId);
		return productServiceImp.findProductPriceByProductId(productId);
	}
}
