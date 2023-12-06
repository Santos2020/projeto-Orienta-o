package com.restaurante.restfood.domain.repository;

import java.util.List;

import com.restaurante.restfood.domain.model.Cidade;

public interface CidadeRepository {
	
	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);

}
