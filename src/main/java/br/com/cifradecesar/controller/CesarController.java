package br.com.cifradecesar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cifradecesar.model.Cesar;
import br.com.cifradecesar.service.CesarService;

@RestController
public class CesarController {
	
	@Autowired
	CesarService cesarService;
	
	@PostMapping ("/descriptografar")
	public Character[] descriptografar(@RequestBody Character[] mensagem) {
		return null; 
	}
	@GetMapping ("/encriptografar/{token}")
	public String encriptografar(@PathVariable ("token") Integer token, String novaMensagem) {
		return cesarService.encriptografar(novaMensagem);
	}
	
	@PostMapping ("/salvarDados")
	public Cesar salvarDados(@RequestBody Cesar cesar) {
		return cesarService.salvarDados(cesar);
	}
	
}
