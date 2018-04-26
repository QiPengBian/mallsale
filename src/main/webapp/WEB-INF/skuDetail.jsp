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
    <link rel="stylesheet" type="text/css" href="css/css.css">
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
        function cart_submit(){

            $("#cart_form").submit();
        }

        function  choose(color) {
            alert(color);
        }


    </script>
    <title>硅谷商城</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="top_img">
    <img src="images/top_img.jpg" alt="">
</div>
<div class="Dbox">
    <div class="box">
        <div class="left">
            <div class="timg"><img src="images/img_5.jpg" alt=""></div>
            <div class="timg2">
                <div class="lf"><img src="images/lf.jpg" alt=""></div>
                <div class="center">
                    <span><img src="images/icon_2.jpg" alt=""></span>
                    <span><img src="images/icon_3.jpg" alt=""></span>
                    <span><img src="images/icon_2.jpg" alt=""></span>
                    <span><img src="images/icon_3.jpg" alt=""></span>
                    <span><img src="images/icon_2.jpg" alt=""></span>
                </div>
                <div class="rg"><img src="images/rg.jpg" alt=""></div>
            </div>
            <div class="goods"><img src="images/img_6.jpg" alt=""></div>
        </div>
        <div class="cent">
            <div class="title">${objsku.skuMch}</div>
            <div class="bg">
                <p>市场价：<strong>￥${objsku.jg}</strong></p>
                <p>促销价：<strong>￥${objsku.jg}</strong></p>
            </div>
            <div class="clear">
                <div class="min_t">选择版本：</div>
                <c:forEach items="${list_sku}" var="sku">
                    <div class="min_mx"><a href="goto_sku_detail.do?sku_id=${sku.id}&spu_id=${sku.shpId}" >${sku.skuMch}</a></div>
                </c:forEach>
            </div>
            <div class="clear">
                <div class="min_t" >颜色：</div>
                <c:forEach items="${colorVersionVO.tpc}" var="color">
                    <div class="min_mx" style="cursor: pointer">${color.shpYs}</div>
                </c:forEach>
            </div>
            <div class="clear">
                <div class="min_t" >款式：</div>
                <c:forEach items="${colorVersionVO.tpv}" var="version">
                    <div class="min_mx"  style="cursor: pointer" onclick="choose(${version.id})">${version.shpBb}</div>
                </c:forEach>
            </div>
            <div class="clear" style="margin-top:20px;">
                <div class="min_t" style="line-height:36px">数量：</div>
                <div class="num_box">
                    <input type="text" name="num" value="1" style="width:40px;height:32px;text-align:center;float:left">
                    <div class="rg">
                        <img src="images/jia.jpg" id='jia' alt="">
                        <img src="images/jian.jpg" id='jian' alt="">
                    </div>
                </div>
            </div>
            <div class="clear" style="margin-top:20px;">
                <form  id="cart_form" action="add_cart.do" method="post">
                    <input type="hidden" name="skuMch" value="${objsku.skuMch}" />
                    <input type="hidden" name="skuJg" value="${objsku.jg}" />
                    <input type="hidden" name="tjshl" value="1" />
                    <input type="hidden" name="hj" value="${objsku.jg}" />
                    <input type="hidden" name="shpId" value="${objsku.shpId}" />
                    <input type="hidden" name="skuId" value="${objsku.id}" />
                    <input type="hidden" name="shpTp" value="${objsku.spu.shpTp}" />
                    <input type="hidden" name="shfxz" value="1" />
                    <input type="hidden" name="kcdz" value="${objsku.kcdz}" />
                    <c:if test="${not empty user}">
                        <input type="hidden" name="yhId" value="${user.id}" />
                    </c:if>
                    <img src="images/shop.jpg" onclick="cart_submit()" alt="" style="cursor:pointer;">
                </form>

            </div>
        </div>
    </div>
</div>
<div class="Dbox1">
    <div class="boxbottom">
        <div class="top">
            <span>商品详情</span>


            <span>评价</span>
        </div>
        <div class="btm">
            ${objsku.spu.shpMch}
            <c:forEach items="${objsku.listimg}" var="image">
                <img src="upload/image/${image.url}" height="200px"/>
            </c:forEach>
            <c:forEach items="${objsku.listav}" var="av_name">
                ${av_name.shxzhMch}:${av_name.shxzh}<br>
            </c:forEach>
        </div>
    </div>
</div>

</body>
</html>