package com.example.customerInfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CustomerInfoController {
	//insert customer data
		@PostMapping(value ="/insert-customer")
		public CustomerInfo insert(@RequestBody CustomerInfo s3) {
			CustomerInfoDA d = new CustomerInfoDA();
			return d.insertCustomer(s3);
		
		}
		// get id no auto generate
		@GetMapping(value ="/customer/new-id")
		public String getNewAccountNo() {
			CustomerInfoDA d = new CustomerInfoDA();
			return d.getNewCustomerId();
		}
		
		
		//Show all customer Data
		List<CustomerInfo> pList = new ArrayList<>();

		
		@RequestMapping(value = "/all-customer")
		public List<CustomerInfo> allCustomer() {

			CustomerInfoDA d = new CustomerInfoDA();
			pList = d.allCustomer();
			return pList;
		}
		
		//get customer by Id
		@GetMapping(value ="/customer/{customer_id}")
		public CustomerInfo customerById(@PathVariable("customer_id") int customer_id) {
			CustomerInfo s ;
			CustomerInfoDA d = new CustomerInfoDA();
			s=d.customerById(customer_id);
			return s;
		}

		
	//Update Data
		@PostMapping(value ="/update")
		public void update(@RequestBody CustomerInfo p) {
			System.out.println(p.customer_id);
			CustomerInfoDA d = new CustomerInfoDA();
				d.updateCustomer(p);
		}
		
		
	//Delete customer Data
		@PostMapping(value ="/delete")
		public void delete(@RequestBody CustomerInfo x) {
			CustomerInfoDA d = new CustomerInfoDA();
				d.deleteCustomer(x);
		}


}
