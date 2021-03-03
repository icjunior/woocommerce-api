package br.com.pacessorios.integracao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Produto {

	private Long id;
	
	private String name;
	
	private String slug;
	
	@JsonProperty("permalink")
	private String permaLink;
	
	private String description;
}
