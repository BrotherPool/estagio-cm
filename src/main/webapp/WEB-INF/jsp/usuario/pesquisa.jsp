<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width">
		<title>Varejo Fácil - Pesquisa</title>
		<link rel="stylesheet" type="text/css" href= "<c:url value = '/css/reset.css'/>" >
		<link rel="stylesheet" type="text/css" href= "<c:url value = '/css/style.css'/>">
		<script type="text/javascript" src= "<c:url value = '/js/1.5.2.js'/>"></script>
		<script type="text/javascript" src= "<c:url value = '/js/jquery.maskedinput-1.3.min.js'/>"></script>
	</head>
	<body>
		<header>
			<div class="caixa">
				<h1><img src= "<c:url value = '/imagens/logo.png'/>" alt="Logo do Varejo Fácil"></h1>
				<nav>
					<ul>
						<li><a href="${linkTo[UsuarioController].novo}">Cadastrar cliente</a></li>
						<li><a href="${linkTo[UsuarioController].pesquisa}">Pesquisar cliente</a></li>
					</ul>
				</nav>
			</div>
		</header>

		<main>
			<form>
				<label for="nomesobrenome">Nome e sobrenome</label>
				<input type="text" id="campoNome" class="input-padrao" required placeholder="Digite seu nome e sobrenome">

				<label for="email">Data de nascimento</label>
				<input type="text" id="campoData" class="input-padrao" required placeholder="Ex.: 00/00/0000">

				<input type="submit" value="Pesquisar cliente" class="enviar">
			</form>

		</main>


		<footer>
			<img src= "<c:url value = '/imagens/logo-branco.png'/>" alt="Logo Casas magalhães">
		</footer>
	</body>
	<script>
		jQuery(function($){
		       $("#campoData").mask("99/99/9999");
		});
	</script>
</html>