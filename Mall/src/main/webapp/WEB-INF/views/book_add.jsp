<%@ page pageEncoding="UTF-8" contentType="text/html; charset=utf-8" %>
<html>
	<head>
		<title>책</title>
	</head>
	<body>
		<h1>책 추가</h1>
		<form action="POST">
			<p>제목: <input type="text" name="title" /></p>
			<p>카테고리: <input type="text" name="category"/></p>
			<p>가격: <input type="text" name="price"/></p>
			<p><input type="submit" value="저장"/></p>
		</form>
	</body>
</html>