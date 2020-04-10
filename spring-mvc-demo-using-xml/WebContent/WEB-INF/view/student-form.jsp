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
		Favorite Language:
		<!--  example for static radio button settings
		<form:radiobutton path="favoriteLanguage" value="Java" />Java
		<form:radiobutton path="favoriteLanguage" value="C#" />C#
		<form:radiobutton path="favoriteLanguage" value="PHP" />PHP -->
		
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
		<br>
		<br>
		Operating Systems:
		<form:checkbox path="operatingSystems" value="linux" /> Linux
		<form:checkbox path="operatingSystems" value="Mac Os" /> Mac Os
		<form:checkbox path="operatingSystems" value="MS Windows" /> MS Windows
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>