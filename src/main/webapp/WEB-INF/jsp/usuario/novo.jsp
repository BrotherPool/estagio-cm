<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width">
		<title>Varejo F�cil - Cadastro</title>
		<link rel="stylesheet" type="text/css" href= "<c:url value = '/css/reset.css'/>" >
		<link rel="stylesheet" type="text/css" href= "<c:url value = '/css/style.css'/>">
		<script type="text/javascript" src= "<c:url value = '/js/1.5.2.js'/>"></script>
		<script type="text/javascript" src= "<c:url value = '/js/jquery.maskedinput-1.3.min.js'/>"></script>
	</head>
	<body>
		<header>
			<div class="caixa">
				<h1><img src= "<c:url value = '/imagens/logo.png'/>" alt="Logo do Varejo F�cil"></h1>
				<nav>
					<ul>
						<li><a href="${linkTo[UsuarioController].novo}">Cadastrar cliente</a></li>
						<li><a href="${linkTo[UsuarioController].pesquisa}">Pesquisar cliente</a></li>
					</ul>
				</nav>
			</div>
		</header>

		<main>
			<form action="${linkTo[UsuarioController].incluirNovo }" id="formulario" method="post">
				<label for="nomesobrenome">Nome e sobrenome</label>
				<input type="text" id="campoNome" name="usuario.nome" class="input-padrao" required placeholder="Digite seu nome e sobrenome">

				<label for="email">Data de nascimento</label>
				<input type="text" id="campoData" name="usuario.dataNascimento" class="input-padrao" required placeholder="Ex.: 00/00/0000">

				<label for="telefone">Senha</label>
				<input type="password" id="campoSenha" name="usuario.senha" class="input-padrao" required placeholder="Digite sua senha">

				<input type="submit" value="Salvar cliente" class="enviar">
			</form>

		</main>


		<footer>
			<img src= "<c:url value = '/imagens/logo-branco.png'/>" alt="Logo Casas magalh�es">
		</footer>
	</body>
	<script>
		jQuery(function($){
		       $("#campoData").mask("99/99/9999");
		});
	</script>
</html>