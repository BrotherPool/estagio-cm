package br.com.projeto.services.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projeto.modelos.Usuario;
import br.com.projeto.services.DataService;
import br.com.projeto.services.UsuarioService;


@Component
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private DataService dataService;
	
	public UsuarioServiceImpl() {
		System.out.println("Criando a bean UsuarioServiceImpl");
	}

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	@Override
	public List<Usuario> ListaUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean UsuarioEhValido(Usuario usuario) {
		// TODO Auto-generated method stub
		return dataService.DataValida(usuario.getDataNascimento()) && dataService.DataMenorQueHoje(usuario.getDataNascimento());
	}

	@Override
	public Usuario salva(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
