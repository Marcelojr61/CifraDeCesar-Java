package br.com.cifradecesar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cifradecesar.model.Cesar;
import br.com.cifradecesar.repository.CesarRepository;
import br.com.cifradecesar.service.CesarService;

@Service
public class CesarServiceImpl implements CesarService {
	
	@Autowired
	CesarRepository cesarRepository;
	
	@Override
	public String encriptografar(String novaMensagem) {
		
		Cesar mensagemRecebida = new Cesar();
		Cesar alfabeto = new Cesar();
		Cesar casa = new Cesar();
		
		char[] mensagems;
				
		for (int i=0; i<mensagemRecebida.getMensagem().length(); i++) {
			if (mensagemRecebida.getMensagem().charAt(i)==' ') {
				mensagems[i]=mensagemRecebida.getMensagem().charAt(i);
			} else {
				
				for(int j=0; j<alfabeto.getAlfabeto().length; j++) {
					if (mensagemRecebida.getMensagem().charAt(i)==alfabeto.getAlfabeto()[j]) {
						if (casa.getCasas()<0) {
							mensagems[i]=alfabeto.getAlfabeto()[(j+casa.getCasas()+alfabeto.getAlfabeto().length)];
							j=alfabeto.getAlfabeto().length;
						} else {
							mensagems[i]=alfabeto.getAlfabeto()[(j+casa.getCasas())];
							j=alfabeto.getAlfabeto().length;	
						}
						
					}else {
						mensagems[i]=mensagemRecebida.getMensagem().charAt(i);
					}
					
				}
				
			}
		
		}	
		
	return "Mensagem encriptada "+ mensagems;		
	}
	

	@Override
	public Character[] descriptografar(Character[] mensagem) {

		return null;
	}
	
	public Cesar salvarDados(Cesar cesar) {	
    return cesarRepository.save(cesar);
    		
	}


	@Override
	public String encriptografar(Character[] mensagem, String novaMensagem, Integer casas) {
		// TODO Auto-generated method stub
		return null;
	}

}
