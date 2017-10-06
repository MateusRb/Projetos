<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="form-group">
	<input type="hidden" name="pessoa.id" value="${pessoa.id}"/>
	
	<input name="pessoa.nome" id="nome" label="pessoa.descricao" value="${pessoa.nome}"  />

	<input name="pessoa.dataNascimento" id="dataNascimento" label="pessoa.dataNascimento" value="${pessoa.dataNascimento}"  type="date"/>

	<input name="pessoa.cpf" id="cpf" label="pessoa.cpf" value="${pessoa.cpf}" />
	
	<input:selectOneRadio value="#{pessoa.funcionario">
    <f:selectItem itemValue="#{true}" itemLabel="Sim" />
    <f:selectItem itemValue="#{false}" itemLabel="Nãao" />
	</input:selectOneRadio>

	<select> </select>
</div>