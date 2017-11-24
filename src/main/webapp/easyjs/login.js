var jq = jQuery.noConflict();
jq(function () {

    var prevURL=document.referrer;

    jq(".l_user").blur(function () {
        var name = $(this).val();
        if (name == null || name == "") {
            alert("用户名不能为空");
        } else if (!/^[a-zA-Z0-9]{6,18}$/.test($(this).val())) {
            alert("用户名必须由6-18字母或数字组成");
        }  else {
        }
    });
    jq(".l_pwd").blur(function () {
        var name = $(this).val();
        if (name == null || name == "") {
            alert("密码不能为空");
        } else if (!/^[a-zA-Z0-9]{6,18}$/.test($(this).val())) {
            alert("密码格式不正确,密码由6-18位字母跟数字组成");
        }
    });
    jq("form").submit(function () {
        var jsons = jq("form").serialize();
        jq.getJSON("/DoLogin", jsons, function (result) {
            if (result == "on") {
                alert("账号密码输入有误！请重新输入");
                jq(this).result();
            } else {
                if (prevURL!=null||prevURL!=""){
                    location.href=prevURL;
                }else{
                    location.href="http://localhost:8080/Jsp/Index.jsp";
                }


            }
        });
        return false;
    })

});