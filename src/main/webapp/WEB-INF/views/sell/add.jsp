<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
		회원아이디<input type="text" name="userId">
		상품명<input type="text" name="itemName">
        상품가격<input type="text" name="itemPrice">
        상품설명<input type="text" name="itemContents">
        상품종료날짜<input type="date" name="itemEndDate">
        위도<input type="number" name="itemLatitude">
        경도<input type="number" name="itemLongtitude">
        주문수량<input type="number" name="itemCount">
        카테고리<input type="text" name="itemCatg">
		<input type="submit" value="등록">
	</form>
	
</body>
</html>