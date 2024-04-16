<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url value="/customers" var="action" />
<%--@elvariable id="customer" type=""--%>
<form:form method="post" action="${action}" modelAttribute="customer" enctype="multipart/form-data">
    <form:errors path="*" element="div" cssClass="alert alert-danger" />
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control"
                    path="name" id="name" placeholder="Tên khách hàng" />
        <label for="name">Tên khách hàng</label>
        <form:errors path="name" element="div" cssClass="text-danger" />
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control"
                    path="address" id="address" placeholder="Địa chỉ" />
        <label for="address">Địa chỉ</label>
        <form:errors path="address" element="div" cssClass="text-danger" />
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control"
                    path="phoneNumber" id="phoneNumber" placeholder="Số điện thoại" />
        <label for="phoneNumber">Số điện thoại</label>
        <form:errors path="phoneNumber" element="div" cssClass="text-danger" />
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="email" class="form-control"
                    path="email" id="email" placeholder="Email" />
        <label for="email">Email</label>
        <form:errors path="email" element="div" cssClass="text-danger" />
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="Date" class="form-control"
                    path="birthday" id="birthday" placeholder="Ngày sinh" />
        <label for="birthday">Ngày sinh</label>
        <form:errors path="birthday" element="div" cssClass="text-danger" />
    </div>


    <div class="form-floating mb-3 mt-3">
        <button class="btn btn-info" type="submit">
            <c:choose>
                <c:when test="${customer.id == null}">Thêm khách hàng</c:when>
                <c:otherwise>Cập nhật khách hàng</c:otherwise>
            </c:choose>
        </button>
    </div>

</form:form>