<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Page</title>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/common-form.css">
</head>
</head>
<body class="normalFormBody">
	<h1 class="heading">Let's set you up</h1>
	<form action="registerUser.html" method="post" >
		<table>
			<tr>
				<td><input type="text" style="width:155px" placeholder="First Name" name="firstName" required>
					<input type="text" style="width:155px" placeholder="Last Name" name="lastName" required>
				</td>
			</tr>
			<tr>
				<td>Date of Birth<br /> <input type="date" name="dob" required></td>
			</tr>
			<tr>
				<td><input type="text" placeholder="Email" name="userEmail" required/></td>
			</tr>
			<tr>
				<td>Gender<br/> 
				    <input type="radio" id="male" name="gender" value="male"> <label for="male">Male</label> 
				    <input type="radio" id="female" name="gender" value="female"> <label for="female">Female</label>
				    <input type="radio" id="other" name="gender" value="other"> <label for="other">Other</label>
				</td>
			</tr>
			<tr>
				<td><input type="text" placeholder="Preferred Username" name="userName" required /></td>
			</tr>
			<tr>
				<td><input type="password" placeholder="Password" name="userPassword" required/></td>
			</tr>
			<tr>
				<td><input type="password" placeholder="Confirm Password" required/></td>
			</tr>
			<tr>
				<td><input type="submit"  class="submitButton"  value="Submit"  /></td>
			</tr>
		</table>
	</form>
</body>
</html>