package br.com.projeto.services;

import java.util.List;

import br.com.projeto.modelos.Usuario;

public interface UsuarioService {
	public List<Usuario> ListaUsuarios();
	
	public boolean UsuarioEhValido(Usuario usuario);
	
	public Usuario salva(Usuario usuario);
	
	
}
