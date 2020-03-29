package br.com.projeto.controllers;


import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.projeto.modelos.Usuario;
import br.com.projeto.services.UsuarioService;

@Resource
public class UsuarioController {
	
	private Result result;
	private UsuarioService usuarioService;

	/*Dando esse problema Error creating bean with name 'usuarioController': Unsatisfied dependency expressed through constructor parameter 1;
	nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 
	'br.com.projeto.services.UsuarioService' available: expected at least 1 bean which qualifies as autowire candidate. 
	Dependency annotations: {}*/
	/*public UsuarioController(Result result, UsuarioService usuarioService) {
		this.result=result;
		this.usuarioService=usuarioService;
	}*/
	
	public UsuarioController(Result result) {
		this.result=result;
	}
	
	@Get
    @Path("/usuario/pesquisa")
    public void pesquisa(){}
    
	@Get
    @Path("/usuario/novo")
    public void novo(){}
	
	@Post
	@Path("/usuario/incluirNovo")
	public void incluirNovo(Usuario usuario) {
		//Vai passar pelo usuario service
		System.out.println(usuario.toString());
		result.redirectTo(this).novo();
	}
}