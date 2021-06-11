package br.com.pacessorios.integracao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrdersController {

	@GetMapping
	public ResponseEntity<T> getCategories() {

	}

	@PostMapping
	public ResponseEntity<T> postCategories() {

	}
}
