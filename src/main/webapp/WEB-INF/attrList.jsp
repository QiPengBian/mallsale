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
    <script type="text/javascript">
        function save_param(shxmId,shxzhid,shxzh,shxzhMch) {
            var bab=$(".attr_"+shxzhid+"").parent().attr("id");
            if(bab.indexOf("sp_")!=-1){
                $(".attr_"+shxzhid+"").attr("src",bab);
                var newnode=$(".attr_"+shxzhid+"").clone();
                $(newnode).attr("json","{\"shxmId\":"+shxmId+",\"shxzhid\":"+shxzhid+"}");
                $("span .attr_"+shxzhid+"").detach();
                $("#paramArea").append(newnode);
            }else{
                var newnode=$(".attr_"+shxzhid+"").clone();
                $(newnode).attr("json","{\"shxmId\":"+shxmId+",\"shxzhid\":"+shxzhid+"}");
                var rr=newnode.attr("src");

                $("div .attr_"+shxzhid+"").detach();
                $("#"+rr+"").append(newnode);
            }
            get_list_by_attr();
        }
        
        function get_list_by_attr() {
            //获取参数
            var jsonStr = "flbh2="+${flbh2};
           var paramy=new Array();
          for(var i=0;i<$("#paramArea input").length ;i++) {

              var json = $.parseJSON($("#paramArea input").eq(i).attr("json"));
              jsonStr = jsonStr + "&listattrvalue["+i+"].shxmId="+json.shxmId+"&listattrvalue["+i+"].shxzhId="+json.shxzhid;

          }
            console.log(jsonStr);

            $.post("get_list_by_attr.do",jsonStr,function(data){

                $("#skulistiner").html(data);
            });


        }

    </script>
    <title>尚硅谷商城</title>
</head>

<body>
<div id = "paramArea" style="height: 30px">

</div>
<hr>
属性列表<br>
<c:forEach items="${mallAttrVOS}" var="attr" varStatus="status">
    ${attr.shxmMch}:
    <span id="sp_${status.index}">
    <c:forEach items="${attr.listvalue}" var="val" >
            <%--<a style="padding-left: 5px"   class="attr_${val.id}" href="javascript:save_param(${attr.id},${val.id},'${val.shxzh},${val.shxzhMch}');">${val.shxzh}${val.shxzhMch}</a>--%>
        <input style="padding-left: 5px;border: none;width: 100px;color: #232296;cursor: pointer" class="attr_${val.id}" onclick="javascript:save_param(${attr.id},${val.id},'${val.shxzh},${val.shxzhMch}');" value="${val.shxzh}${val.shxzhMch}"></input>
    </c:forEach>
    </span>
    <br>
</c:forEach>
</body>
</html>
