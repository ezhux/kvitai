<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="<c:url value="/resources/kvitai.css" />" rel="stylesheet">
</head>
<body>
    <c:forEach items="${zinb.zin}" var="zin">
        <div>
            <c:out value="${zin.getZinNum()}" />
            	
            		<c:forEach items="${zin.line}" var="line">
            		<table class="kvitas">
            		<tr>
            			<td>
            			<span class="smaller">Išmokas mokančios įmonės darbuotojui liekantis egzempliorius</span>
            			</td>
            		</tr>
            	<tr>
            			<td>
            			<span class="underline">UAB "Bastaras", 179460961</span>
            		</td>
            		</tr>
            		<tr>
            			<td>
            			<span>IŠMOKŲ IŠMOKĖJIMO KVITAS</span>
            			<span>serija: </span>
            			<span class="underline">id</span>
            			<span>Nr: </span>
            			<span class="underline"> number </span>
            		</td>
            		</tr>	
            	<tr>
            			<td>
            			<span class="smaller">(išmokų mokėjimo data pagal patvirtintą grafiką)</span>
            		</td>
            		</tr>
            		<tr>
            			<td>
            			<span>Gavėjas</span>
            			<span class="underline capitalize"><c:out value="${line.getVardas()}" /> <c:out value="${line.getPavarde()}" /> </span>
            			<span><c:out value="${line.getAsmK()}" /> <!--<c:out value="${line.getAsmId()}" />--></span>
            			<span><c:out value="${line.getPensByla()}" /> </span>
            			<span><c:out value="${line.getAdr()}" /> </span>
            		</td>
            		</tr>
            		<tr>
            			<td>
            			<span>Išmokos mokėtojas</span>
            			<span class="underline">VSDVF Klaipėdos skyrius</span>
            		</td>
            		</tr>
            		<tr>
            			<td>	
            			<span>Priskaičiuota ir išskaityta <br /> išmokos suma už <c:out value="${line.getEinMenuo()}" /> mėn </span>
            			<span><c:out value="${line.getIsmEinSuma()}" /> + <c:out value="${line.getIsmPraSuma()}" /> - <c:out value="${line.getIsmIskSuma()}" /> = <c:out value="${line.getIsmSuma()}" /></span>
            		</td>
            		</tr>
            		<tr>
            			<td>
            				<table>
            					<tr>
            						<td width="400px"></td>
            						<td><span class="underline bigger"><c:out value="${line.getIsmSuma()}" /></span></td>
            					</tr>
            					<tr>
            						<td><span class="smaller">(išmokėta suma žodžiu)</span></td>
            						<td><span class="smaller">(išmokėta suma skaičiais)</span></td>
            					</tr>
            				</table>
            		</td>
            		</tr>	
            		<tr>
            			<td>
            				<table>
	            				<tr>
	            					<td rowspan="2" width="100px"><span>Pinigus gavau</span></td>
	            					<td>_______________</td>
	            					<td>_______________</td>
	            				</tr>
	            				<tr>
	            					<td><span class="smaller">(išmokos gavimo data)</span></td>
	            					<td><span class="smaller">(gavėjo parašas)</span></td>
	            				</tr>
            				</table>
            		</td>
            		</tr>
            		<tr>
            			<td>
            				<table>	
            					<tr>
            						<td rowspan="2" width="100px">
	            						<span>Išmokėjo</span>
	            					</td>
	            					<td><span class="underline">Pensijų išnešiotojas</span></td>
	            					<td>______________________</td>
	            				</tr>
	            				<tr>
		            				<td width="300px">
		            					<span class="smaller superscript">(pareigos, vardas, pavardė )</span>
		            				</td>
		            				<td>	
		            					<span class="smaller">(parašas)</span>
		            				</td>	
		            			</tr>
            				</table>
            		</td>
            		</tr>
            		<tr>
            			<td>	
            			<span>Pastabos</span>
            			<span>________________________________________________</span>
            		</td>
            		</tr>
<%-- 	            		 	<c:out value="${line.getZeId()}" />  --%>
<%-- 	            		 	<c:out value="${line.getNr()}" />  --%>
<%-- 	            		 	<c:out value="${line.getIsmData()}" />  --%>
<%-- 	            		 	<c:out value="${line.getNeismPrK()}" />  --%>
<%-- 	            		 	<c:out value="${line.getPasoNr()}" /> --%>
<%-- 	            		 	<c:out value="${line.getFinSlt()}" /> --%>
<%-- 	            		 	<c:out value="${line.getPozMok()}" />  --%>
            		</table>
            	
            		</c:forEach>
            	
        </div>
    </c:forEach>

   
</body>
</html>