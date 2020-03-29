package testes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.projeto.modelos.Usuario;
import br.com.projeto.services.UsuarioService;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/META-INF/applicationContext.xml");
		UsuarioService service = context.getBean("usuarioServiceImpl",UsuarioService.class);
		Usuario user = new Usuario();
		user.setId(1);
		user.setNome("dsdsds");
		user.setDataNascimento("24/08/1997");
		user.setSenha("1234");
		System.out.println(service.UsuarioEhValido(user));
		System.out.println(user.toString());
		context.close();
	}

}
