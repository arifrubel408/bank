package com.example.cart;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CartController {

	//Add to Cart
	@PostMapping(value ="/add2Cart")
	public Cart insert(@RequestBody Cart s1) {
		CartDA d = new CartDA();
		return d.insert(s1);
	
	}
	
	// get cart data by retailer id
		@GetMapping(value = "/cart-data/{id}")
		public List<Cart> getCartDataById(@PathVariable("id") int id) {
			CartDA s = new CartDA();
			return s.getCartDataByCutomerId(id)
	;

		}
	
}
