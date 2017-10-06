<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	<div class="page-header">
		<h1>Pessoas</h1>
	</div>


	<div class="table-responsive">
		<!-- div table responsive -->
		<table class="table table-bordered" style="border: 0px;">
			<tbody>
			<thead>
				<tr class="well">
					<th style="border-top: 0px;" width="15%">Codigo</th>
					<th style="text-align: right; border-top: 0px;" width="35%">Nome</th>
					<th style="text-align: right; border-top: 0px;" width="35%">Data Nascimento</th>
					<th style="text-align: right; border-top: 0px;" width="21%">Cpf</th>
					<td width="4%"><a class="btn btn-success btn-xs" type="button" href="${linkTo[PessoaController].novo}">
					<span class="glyphicon glyphicon-plus"></span></a></td>
				</tr>
			</thead>
			<c:forEach items="${pessoas}" var="pessoa">
				<tr>
					<td><c:out value="${pessoa.codigo}" /></td>
					<td align="right"><c:out value="${pessoa.nome}" /></td>
					<td align="right"><c:out value="${pessoa.dataNascimento}" /></td>
					<td align="right"><c:out value="${pessoa.cpf}" /></td>
					<td><a class="btn btn-xs btn-primary" type="button" href="${linkTo[PessoaController].visualizar[pessoa]}">
					<span class="glyphicon glyphicon-pencil"></span></a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>