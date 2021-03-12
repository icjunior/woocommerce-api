package br.com.pacessorios.integracao.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Produto {

	@JsonInclude(value = Include.NON_NULL)
	private Long id;
	private String name;
	private String type;

	@JsonProperty(value = "regular_price")
	private BigDecimal regularPrice;
	private boolean virtual;
	private boolean downloadable;
	private List<DownloadDTO> downloads;
	private List<CategoriaDTO> categories;
	private List<ImagemDTO> images;
}
