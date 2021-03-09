<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
<c:when test="${ clientCommand == null }">
	<h1 class="feo" id="titulo">Listado de todos los Productos</h1>
</c:when>
<c:when test="${ clientCommand != null }">
	<h1 class="feo" id="titulo">Listado Productos del cliente ${clientCommand.codigo} - ${clientCommand.nombre} </h1>
</c:when>
</c:choose>
	<table id="tablaClientes">
		<tr id="Cabecera">
			<th class="feo">Descripcion</th>
			<th class="feo">Precio</th>
		</tr>
		<c:forEach items="${ listaProductos }" var="producto" varStatus="loop">
			<tr id="fila${producto.id}">
				<td>${ producto.description }</td>
				<td>${ producto.price }</td>
			</tr>
		</c:forEach>
		<!-- loop -->
	</table>


