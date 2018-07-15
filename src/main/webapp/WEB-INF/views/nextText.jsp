<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Next Text !!</h1>
<P>  The time on the server is ${serverTime}. </P>

<h1>Form test: </h1>
<form id="form" method="post">
	name:<input type="text" name="name"/>
	age: <input type="text" name="age"/>
	phoneNumber: <input type="text" name="phoneNumber" />
	<input type="submit"/>
	<button type="submit">Submit</button>
</form>
<div id="formsContent">
	<c:if test="${not empty message}">
		<div id="message" class="success"><c:out value="${message}"/></div>
	</c:if>
</div>

<script type="text/javascript">
	$(document).ready(function() {
		$("#form").submit(function() {  
			$.post(
					$(this).attr("action"), 
					$(this).serialize(), 
					function(html) {
						$("#formsContent").replaceWith(html);
// 						$('html, body').animate({ scrollTop: $("#message").offset().top }, 500);
					});
			return false;  
		});			
	});
</script>
</body>
</html>