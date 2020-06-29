<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Product</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div align="center">
		<h2>Add New Product</h2>
		<s:form action="addAction" class="formTable">
			<s:textfield name="prodId" label="Product Id" class="formTextField"/>
			<s:textfield name=" prodName" label="Name" class="formTextField"/>
			<s:textfield name=" prodCategory" label="Category" class="formTextField"/>
			<s:textfield name=" prodPrice" label="Price" class="formTextField"/>
			<s:submit value="Add Product" class="actionBtn"/>
		</s:form>
	</div>
</body>
</html>