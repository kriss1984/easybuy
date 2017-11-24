var jq = jQuery.noConflict();
jq(function () {
    jq.getJSON("/DoLogin")
    jq("[href='Login.jsp']").eq(0).html(dataOne.loginName);
    if(dataOne.loginName!="请登录"){
        jq("[href='Login.jsp']").eq(0).attr("href","/Jsp/Member.jsp");
    }

        jq("div.leftNav ul").load("/IndexInitServlet");
});