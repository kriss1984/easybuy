<%--
  Created by IntelliJ IDEA.
  User: youbook
  Date: 2017/11/23
  Time: 上午10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach items="${list1}" var="list1" varStatus="sta">
    <li name="${list1.id}">
        <div class="fj" >
            <span class="n_img"><span></span><img src="/images/nav${sta.index+1}.png" /></span>
            <span class="fl">${list1.name}</span>
        </div>
        <div class="zj" style="top:${sta.index*(-40)}px;">
            <div class="zj_l">
                <c:forEach items="${list2}" var="list2">
                    <c:if test="${list2.parentId == list1.id}">
                        <div class="zj_l_c">
                            <h2>${list2.name}</h2>
                            <c:forEach  items="${list3}" var="list3">
                                <c:if test="${list3.parentId == list2.id}">
                                    <a href='/BrandListServlet?category=${list1.id}'>${list3.name}|</a>
                                </c:if>
                            </c:forEach>
                        </div>
                    </c:if>
                </c:forEach>
            </div>
            <div class="zj_r">
                <a href="#"><img src="../images/n_img1.jpg" width="236" height="200" /></a>
                <a href="#"><img src="../images/n_img2.jpg" width="236" height="200" /></a>
            </div>
        </div>
    </li>
</c:forEach>
