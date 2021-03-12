package br.com.pacessorios.integracao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.pacessorios.integracao.model.IntegracaoDTO;
import br.com.pacessorios.integracao.service.GestaoProdutoService;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

	@Autowired
	private GestaoProdutoService gestaoProdutoService;

	@PostMapping("batch")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<IntegracaoDTO> batch(@RequestBody IntegracaoDTO produtos) {
		ResponseEntity<IntegracaoDTO> retorno = gestaoProdutoService.batchInputProdutos(produtos);
		
		return retorno;
	}
}