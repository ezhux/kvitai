<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>

<table class="kvitas">
	<tr>
		<td>
			<span class="smaller">Išmokas mokančios įmonės 	darbuotojui liekantis egzempliorius</span>
			<jsp:include page="kvitas.jsp">
				<jsp:param name="line" value="${param.line}"/>
			</jsp:include>
		</td>
		<td>
			<span class="smaller">Išmokas gavėjui įteikiamas egzempliorius</span>
			<jsp:include page="kvitas.jsp" />
		</td>	
	</tr>
</table>