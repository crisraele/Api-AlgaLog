package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Ana Crisraele Santos");
		cliente1.setTelefone("81 9875624568");
		cliente1.setEmail("teste@euconsigo.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Jesus");
		cliente2.setTelefone("81 9875624568");
		cliente2.setEmail("morreupormim@salvador.com");
		
		
		return Arrays.asList(cliente1, cliente2);
	}
}
