package com.example.customerlogin;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CustomerLoginController {

	// Login Data
	@PostMapping(value = "/login-customer")
	public CustomerLogin save(@RequestBody CustomerLogin s1) {
		CustomerLoginDA d = new CustomerLoginDA();
		return d.checkCustomer(s1);
	}

}
