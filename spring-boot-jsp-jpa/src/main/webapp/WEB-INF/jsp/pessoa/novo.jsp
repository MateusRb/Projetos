<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
		<script type="text/javascript">
			jQuery(function($) {
				$("#cpf").mask("999.999.999-99");
			});
		</script>


	<jsp:body>
	<div class="page-header">
		<h1>Nova Pessoa</h1>
	</div>
	<form id="formSalvaClienteUsuario" class="form-horizontal"
			action="${linkTo[PessoaController].salvar}" method="post">
		
			<c:import url="_camposPessoa.jsp" />

		<div class="col-xs-12 pull-right">
			<div class="clearfix form-actions">
				<div class="pull-right">
					<a class="btn btn-default" type="button"
									href="${linkTo[PessoaController].listar}">Voltar</a>
					<button class="btn btn-primary" type="submit">Salvar</button>
				</div>	
			</div>
		</div>	
	</form>

