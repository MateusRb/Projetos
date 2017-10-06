<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


	<div class="page-header">
		<h1>Novo Projeto</h1>
	</div>
	<form id="formSalvaClienteUsuario" class="form-horizontal"
			action="${linkTo[ProjetoController].salvar}" method="post">
		
			<c:import url="_camposProjeto.jsp" />

		<div class="col-xs-12 pull-right">
			<div class="clearfix form-actions">
				<div class="pull-right">
					<a class="btn btn-default" type="button"
									href="${linkTo[ProjetoController].listar}">Voltar</a>
					<button class="btn btn-primary" type="submit">Salvar</button>
				</div>	
			</div>
		</div>	
	</form>

