package com.restaurante.restfood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.restaurante.restfood.RestfoodApiApplication;
import com.restaurante.restfood.domain.model.Cozinha;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = (ApplicationContext) new SpringApplicationBuilder(
				RestfoodApiApplication.class).web(WebApplicationType.NONE).run(args);

		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

		List<Cozinha> cozinhas = cadastroCozinha.listar();

		for (Cozinha cozinha : cozinhas) {
			System.out.println(cozinha.getNome());
		}

	}

}