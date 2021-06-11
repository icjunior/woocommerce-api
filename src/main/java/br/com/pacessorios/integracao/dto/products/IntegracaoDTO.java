package br.com.pacessorios.integracao.dto.products;

import java.util.List;

public class IntegracaoDTO {

	private List<Produto> create;
	private List<Produto> update;

	public List<Produto> getCreate() {
		return create;
	}

	public void setCreate(List<Produto> create) {
		this.create = create;
	}

	public List<Produto> getUpdate() {
		return update;
	}

	public void setUpdate(List<Produto> update) {
		this.update = update;
	}
}
