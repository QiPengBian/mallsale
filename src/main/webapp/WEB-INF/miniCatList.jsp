<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: luwan
  Date: 2018/4/2
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">

    </script>
</head>
<body>
<h6>最新加入的商品</h6>
<c:forEach items="${list_cart}" var="cat" >
    <div class="one" >
        <img src="images/lec1.png" width="80px;"/>
        <span class="one_name">
						价格${cat.skuMch}
					</span>
        <span class="one_count">
                        数量 ${cat.tjshl}
        </span>
        <span class="one_prece">
						<b>${cat.skuJg}</b><br />
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除
        </span>
    </div>
</c:forEach>


<div class="gobottom" >
    共<span>${count}</span>件商品&nbsp;&nbsp;&nbsp;&nbsp;
    共计￥<span>${sum}</span>
    <button class="goprice">去购物车</button>
</div>
</body>
</html>
