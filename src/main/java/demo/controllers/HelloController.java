package demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.shoppingApp.Product;
import demo.shoppingApp.RestUI;

@RestController
public class HelloController {

	RestUI restUI = new RestUI();
	
	public HelloController() {

	}
	
	@RequestMapping("/")
	public String sayHi() {
		return "Available actions: 1. /products "
									+ "2. /cart "
									+ "3. /addtocart "
									+ "4. /remvoefromcart";
	}
	
	@RequestMapping("/products")
	public List<Product> getProducts() {
		return restUI.getProducts();
	}
	
	@RequestMapping("/cart")
	public List<Product> getCartItems() {
		return restUI.getCartItems();
	}
	
	@RequestMapping("/addtocart")
	public String addToCart() {
		restUI.addProductToCart(1);
		return "Success";
	}
	
	@RequestMapping("/removefromcart")
	public String removeFromCart() {
		restUI.removeProductFromCart(1);
		return "Success";
	}
	

}
