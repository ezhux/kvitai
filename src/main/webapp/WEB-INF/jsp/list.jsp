<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
<link href="<c:url value="/resources/kvitai.css" />" rel="stylesheet">
	<title>Visi failai</title>
</head>
<body>
<body>
	<table>
	<c:forEach items="${files}" var="file" varStatus="status">
	<tr>
		<td><c:out	value="${file}" /></td>
		<td>
		

			<a href=" 			<spring:url value="/print" >
				<spring:param name="filename" value="${file}"></spring:param>
			</spring:url> "><spring:message code="print"/></a>
		</td>
		<td><a href="<spring:url value="/edit" />"><spring:message code="edit"/></a></td>
	</tr>	 
	</c:forEach>
	</table>
</body>
</html>