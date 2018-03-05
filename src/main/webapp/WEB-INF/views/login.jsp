<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<H2>Login Page</H2>
	<Form action="login" method="post">
		<Table>
			<Tr>
				<td>User Name</td>
				<th><Input type="text" name="userName" /></th>
			</Tr>

			<Tr>
				<td>Password</td>
				<th><Input type="password" name="password" /></th>
			</Tr>
			<Tr>
				<td colspan="2"><Input type="submit" value="Verify Me" /></td>
			</Tr>

		</Table>
	</Form>
</body>
</html>