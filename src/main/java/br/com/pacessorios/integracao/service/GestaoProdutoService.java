package br.com.pacessorios.integracao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.pacessorios.integracao.model.IntegracaoDTO;

@Service
public class GestaoProdutoService {

	private static final String CONSUMER_KEY = "ck_64703a3826b68326235ecc81678f7f1a07f6c760";
	private static final String CONSUMER_SECRET = "cs_81b14e66fb70cf5652a68ab99423c6349b4db544";
	private static final String URL = "https://domia.com.br/2p-acessorios/wp-json/wc/v3/products/batch";
	private static final String URL_COMPLETA = URL + "?consumer_key=" + CONSUMER_KEY + "&consumer_secret="
			+ CONSUMER_SECRET;

	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<IntegracaoDTO> batchInputProdutos(IntegracaoDTO produtos) {
		System.out.println(produtos);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return restTemplate.postForEntity(URL_COMPLETA, produtos, IntegracaoDTO.class);
	}
}
