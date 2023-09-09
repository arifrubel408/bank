package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController


public class CardController {

	//Insert Data
		@PostMapping(value ="/saveCard")
		public Card insert(@RequestBody Card s) {
			CardDA d = new CardDA();
			return d.insert(s);

		}
		
		
	// show all data in card
	List<Card> cardList = new ArrayList<>(); //
	@GetMapping(value ="/show-card")   //getMapping er maddome data get kora 
	public List<Card> showCard(CardDA s){ //instance
			s=new CardDA();
			return cardList=s.ShowProduct();
			
	}
	
	@GetMapping(value="/show-product/{id}")
	public Card showProductInfoById(@PathVariable("id") int id) {
		Card crd;
		CardDA cardDA = new CardDA();
		crd = cardDA.getProductById(id);
		return crd;
		
	}
	
}
