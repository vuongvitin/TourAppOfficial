<%-- 
    Document   : login
    Created on : Aug 28, 2021, 5:56:43 AM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:if test="${param.successMsg != null}">
    <div class="alert alert-danger">
        ${param.successMsg}}
    </div>
</c:if>
    



<c:url value="/login" var="action"  />

<h1 class="text-center text-danger">ĐĂNG NHẬP</h1>



<c:if test="${param.error != null}">
    <div class="alert alert-danger"> 
        <p>ĐÃ CÓ LỖI XẢY RA!!</p>
    </div>
</c:if>

<c:if test="${param.accessDenied != null}">
    <div class="alert alert-danger"> 
        Bạn không có quyền truy cập!
    </div>
</c:if>

<form method="post" action="${action}">
    <div class="form-group"> 
        <label for="username">Tài khoản:</label>
        <input type="text" id="username" name = "username" class="form-control"/> 
    </div>
    <div class="form-group"> 
        <label for="password">Mật khẩu:</label>
        <input type="password" id="password" name = "password"" class="form-control"/> 
    </div>
    <div class="form-group">
        <input type="submit" value="ĐĂNG NHẬP" class="btn btn-danger"/>
    </div>
</form>