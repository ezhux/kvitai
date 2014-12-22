<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
<link href="<c:url value="/resources/kvitai.css" />" rel="stylesheet">
	<title>Kvitai</title>
</head>
<body>

<a href="<spring:url value="/upload" />"><spring:message code="upload.new"/></a>
</body>
</html>
