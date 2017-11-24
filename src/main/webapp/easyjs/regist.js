var jq = jQuery.noConflict();
jq(function () {


    jq("form").submit(function () {
        var fom=jq("form").serialize();
            jq.getJSON("/DoRegist",fom,function (result) {
               if(result==1){alert("注册成功")}else {alert("用户名已经存在")}
            });
            return false;
        }
    )


});