<%--
  Created by IntelliJ IDEA.
  User: MARGIN
  Date: 2023/5/17
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
  共有${pageInfo.total }条记录，共${pageInfo.pages }页，每页
  <select name="pageSize" onchange="changePageSize(this.value)" style="width:50px;">
    <option value="3" ${pageInfo.pageSize==3?"selected":"" }>3</option>
    <option value="5" ${pageInfo.pageSize==5?"selected":"" }>5</option>
    <option value="10" ${pageInfo.pageSize==10?"selected":"" }>10</option>
    <option value="20" ${pageInfo.pageSize==20?"selected":"" }>20</option>
    <option value="50" ${pageInfo.pageSize==50?"selected":"" }>50</option>
    <option value="100" ${pageInfo.pageSize==100?"selected":""}>100</option>
  </select>
  条记录，当前${pageInfo.pageNum }/${pageInfo.pages }页，
  <a href="javascript:homePage()">首页</a>|
  <a href="javascript:frontPage()">上一页</a>|
  <a href="javascript:nextPage()">下一页</a>|
  <a href="javascript:lastPage()">尾页</a>|
  转到<select name="pageNum" onchange="goPage(this.value)" style="width:50px;">
  <c:forEach begin="1" end="${pageInfo.pages }" var="i">
    <option value=${i} ${pageInfo.pageNum==i?"selected":"" }>${i }
    </option>
  </c:forEach>
</select>
</div>
<script type="text/javascript">
  function homePage(){
    document.getElementById("pageNum").value=1;
    document.getElementById("pager").submit();//表单提交
  }
  function frontPage(){
    document.getElementById("pageNum").value=${pageInfo.pageNum<=1? 1 :
pageInfo.pageNum-1 };
    document.getElementById("pager").submit();//表单提交
  }
  function nextPage(){
    document.getElementById("pageNum").value=${pageInfo.pageNum>=pageInfo.pages?
pageInfo.pages:pageInfo.pageNum+1 };
    document.getElementById("pager").submit();//表单提交
  }
  function lastPage(){
    document.getElementById("pageNum").value=${pageInfo.pages };
    document.getElementById("pager").submit();//表单提交
  }
  function goPage(cur_page){
    document.getElementById("pageNum").value=cur_page;
    document.getElementById("pager").submit();//表单提交
  }
  function changePageSize(cur_pageSize){
    document.getElementById("pageSize").value=cur_pageSize;
    document.getElementById("pager").submit();//表单提交
  }
</script>
