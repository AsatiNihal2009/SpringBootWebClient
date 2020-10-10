package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.beans.Quote;

@RestController
public class ConsumerController {
	@GetMapping("/")
	public String fetchData() {
		//create a rest Template
		RestTemplate rest=new RestTemplate();
		String url="https://gturnquist-quoters.cfapps.io/api/random";
		Quote q=rest.getForObject(url, Quote.class);
		return q.getValue().getQuote().toString();
	}
}
