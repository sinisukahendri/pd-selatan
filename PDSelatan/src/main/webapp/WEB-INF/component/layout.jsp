<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/main.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/basic-navigation.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/jquery.dataTables.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/jquery.dataTables_themeroller.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/ui-lightness/jquery-ui-1.10.3.custom.css" />

<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-ui-1.10.3.custom.js"></script>
		

</head>
<body>

<div class="global-container">
    <tiles:insertAttribute name="header" />
    <tiles:insertAttribute name="topmenu" />
    <div class="body-container">
		<tiles:insertAttribute name="body" />
	</div>
	<div class="footer">
    	<tiles:insertAttribute name="footer" />
	</div>
</div>
</body>
</html>