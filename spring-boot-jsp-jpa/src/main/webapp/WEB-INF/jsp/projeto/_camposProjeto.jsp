<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="form-group">
	<input type="hidden" name="projeto.id" value="${projeto.id}"/>
	
	<input name="projeto.nome" id="nome" value="${projeto.nome}"   type="text" />

	<input name="projeto.data_inicio" id="data_inicio"  value="${projeto.data_inicio}"  type="date"/>

	<input name="projeto.data_previsao_fim" id="data_previsao_fim"  value="${projeto.data_previsao_fim}"  type="date"/>
	
	<input name="projeto.data_fim" id="data_fim"  value="${projeto.data_fim}"  type="date"/>
	
	<input name="projeto.descricao" id="descricao" value="${projeto.descricao}"  type="text" />

	<input name="projeto.orcamento" id="orcamento" value="${projeto.orcamento}"  type="text" />
	
	 <select NAME="gerente" >
      <c:forEach var="pessoa" items="${pessoas}">
        <option>
          <c:out value="${pessoa.nome}" />
        </option>
      </c:forEach>
    </select>
    
     <select NAME="risco" >
      <c:forEach var="risco" items="${riscos}">
        <option>
          <c:out value="${risco.descricao}" />
        </option>
      </c:forEach>
    </select>
	
	  <select NAME="status" >
      <c:forEach var="stat" items="${status}">
        <option>
          <c:out value="${stat.descricao}" />
        </option>
      </c:forEach>
    </select>

	<select> </select>
</div>