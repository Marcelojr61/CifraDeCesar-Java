package br.com.cifradecesar.service;

import br.com.cifradecesar.model.Cesar;

public interface CesarService {
	
	Character[] descriptografar(Character[] mensagem);
	Cesar salvarDados(Cesar cesar);
	String encriptografar(Character[] mensagem, String novaMensagem);
	
	
	String encriptografar(Character[] mensagem, String novaMensagem, Integer casas);
	String encriptografar(String novaMensagem);
	
	
}
