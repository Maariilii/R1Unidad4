<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>Boot Sample | Home</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Bootsample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-product">New product</a></li>
					<li><a href="all-products">All product</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Product Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_PRODUCTS'}">
			<div class="container text-center" id="productsDiv">
				<h3>My Products</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>ProductName</th>
								<th>ProductDescription</th>
								<th>ProductPrice</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="product" items="${products}">
								<tr>
									<td>${product.id}</td>
									<td>${product.productName}</td>
									<td>${product.productDescription}</td>
									<td>${product.productPrice}</td>
									<td><a href="update-product?id=${product.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-product?id=${product.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Product</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-product">
					<input type="hidden" name="id" value="${product.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">ProductName:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="productName"
								value="${product.productName}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">ProductDescription:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="productDescription"
								value="${product.productDescription}" />
						</div>
					</div>
					
					
					<div class="form-group">
						<label class="control-label col-sm-3">ProductPrice:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="productPrice"
								value="${product.productPrice}" />
						</div>
					</div>
				

					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>

				</form>
			</div>
		</c:when>
		</c:choose>
		<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
		

</body>
</html>