<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/main.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/basic-navigation.css" />

</head>
<body>

<div class="global-container">
    <tiles:insertAttribute name="header" />
    <tiles:insertAttribute name="topmenu" />
    <div class="body-container">
		<tiles:insertAttribute name="body" />
	</div>
    <tiles:insertAttribute name="footer" />
</div>
</body>
</html>