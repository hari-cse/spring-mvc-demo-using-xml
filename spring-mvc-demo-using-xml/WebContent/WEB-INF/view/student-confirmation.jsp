<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation Form</title>
</head>
<body>
	The Student is confirmed: ${student.firstName} ${student.lastName}
	<br>
	<br> 
	Country: ${student.country}
</body>
</html>