<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath %>">
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>尚硅谷商城</title>
    <script type="text/javascript">

            function chooseOn(index) {

                 document.getElementById("spu_"+index+"").click();
            }


    </script>
</head>
<body>
商品列表
<c:forEach items="${listsku}" var="sku">
    <div  style="margin-top:10px;margin-left:10px;float:left;border:1px red solid;width:250px;height:250px;cursor: pointer" onclick="chooseOn(${sku.id})">
        <img src="upload/image/${sku.spu.shpTp}" width="150px" height="150px"><br>
            <a id="spu_${sku.id}" href="goto_sku_detail.do?sku_id=${sku.id}&spu_id=${sku.spu.id}" target="_blank">${sku.skuMch}</a><br>
            ${sku.jg}<br>
            ${sku.skuXl}<br>
    </div>
</c:forEach>
</body>
</html>
