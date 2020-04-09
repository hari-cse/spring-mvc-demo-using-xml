<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
		<br>
		<br>
	Last name: <form:input path="lastName" />
		<br>
		<br>
	Country:
			<form:select path="country">
			<!--  example for static option settings
			<form:option value="Brazil" label="Brazil" />
			<form:option value="Germany" label="Germany" />
			<form:option value="India" label="India" />  -->
			<!--  example for options settings using POJO Student
		<form:options items="${student.countryOptions}"/> -->
			<!--  example for options settings using Properties file-->
			<form:options items="${countryOptions}" />
		</form:select>
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>