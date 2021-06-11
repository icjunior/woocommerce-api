package br.com.pacessorios.integracao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.pacessorios.integracao.dto.products.IntegracaoDTO;

@Service
public class GestaoCategoriesService {

	@Value(("${CONSUMER_KEY}"))
	private String ConsumerKey;

	@Value("${CONSUMER_SECRET}")
	private String consumerSecret;

	@Value("${BASE_URL}")
	private String baseUrl;

	@Value("${SUFIXO_CATEGORIES}")
	private String sufixoCategories;

	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<IntegracaoDTO> batchInputProdutos(IntegracaoDTO produtos) {
		System.out.println(produtos);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return restTemplate.postForEntity(montaUrl(), produtos, IntegracaoDTO.class);
	}

	private String montaUrl() {
		return baseUrl.concat(sufixoCategories).concat("consumer_key").concat(ConsumerKey).concat("&consumer_secret")
				.concat(consumerSecret);
	}
}
