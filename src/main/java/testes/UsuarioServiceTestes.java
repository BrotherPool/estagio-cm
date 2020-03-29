package testes;

import br.com.projeto.modelos.Usuario;
import br.com.projeto.services.impl.UsuarioServiceImpl;

public class UsuarioServiceTestes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();
		user.setId(1);
		user.setNome("Roberval");
		user.setDataNascimento("24/08/1997");
		UsuarioServiceImpl teste = new UsuarioServiceImpl();
		System.out.println(teste.UsuarioEhValido(user));
	}

}
