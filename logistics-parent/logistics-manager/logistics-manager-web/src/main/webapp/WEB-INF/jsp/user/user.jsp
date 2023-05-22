<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/js/jquery.js"></script>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">数据表</a></li>
        <li><a href="#">基本内容</a></li>
    </ul>
</div>
<div class="rightinfo">
    <div class="tools">
        <ul class="toolbar">
            <li><a href="/user/addUser"><span><img src="/images/t01.png" /></span>添加</a></li>
            <li><span><img src="/images/t04.png" /></span>统计</li>
        </ul>
        <ul class="toolbar1">
            <li><span><img src="/images/t05.png" /></span>设置</li>
        </ul>
    </div>
    <table class="tablelist">
        <thead>
        <tr>
            <th><input name="" type="checkbox" value="" checked="checked"/></th>
            <th>编号<i class="sort"><img src="/images/px.gif" /></i></th>
            <th>账号</th>
            <th>姓名</th>
            <th>密码</th>
            <th>邮箱</th>
            <th>电话</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pageInfo.list}" var="user">
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>${user.userId}</td>
                <td>${user.userName}</td>
                <td>${user.realName}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td><a href="/user/addUser?userId=${user.userId}" class="tablelink">更新</a>
                    <a href="JavaScript:void(0)" onclick="deleteUser(${user.userId})" class="tablelink"> 删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="pagin">
        <jsp:include page="/PageBar.jsp" ></jsp:include>
        <form action="/user/users" method="get" id="pager">
            <input type="hidden" name="pageSize" id="pageSize"
                   value="${pageInfo.pageSize}"/>
            <input type="hidden" name="pageNum" id="pageNum"
                   value="${pageInfo.pageNum}"/>
        </form>
    </div>
</div>
<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
    function deleteUser(userId){
        if(window.confirm("是否确定要删除记录")){
            window.location.href="/user/deleteUser?userId="+userId;
        }
    }
</script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?
id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>