package br.com.pacessorios.integracao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.pacessorios.integracao.model.Produto;

@RestController
@RequestMapping("produto")
public class ProdutoController {

	private static final String CONSUMER_KEY = "ck_64703a3826b68326235ecc81678f7f1a07f6c760";
	private static final String CONSUMER_SECRET = "cs_81b14e66fb70cf5652a68ab99423c6349b4db544";

	@GetMapping("{id}")
	public ResponseEntity<Produto> recuperarProduto(@PathVariable("id") String item) {
		RestTemplate restTemplate = new RestTemplate();
		Produto produto = restTemplate
				.getForObject("https://domia.com.br/2p-acessorios/wp-json/wc/v3/products/1983?consumer_key="
						+ CONSUMER_KEY + "&consumer_secret=" + CONSUMER_SECRET, Produto.class);

		return ResponseEntity.ok(produto);
	}
}