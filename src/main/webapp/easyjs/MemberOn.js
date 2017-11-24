var jq = jQuery.noConflict();
jq(function () {
    jq("#address").click(function() {

        loads("address");
    });

    jq("#order").click(function() {
        loads("order");
    });

    jq("#user").click(function() {
        loads("user");
    });
    jq("#collect").click(function() {
        loads("collect");
    });
    jq("#msg").click(function() {
        loads("msg");
    });
    jq("#links").click(function() {
        loads("links");
    });

    jq("#packet").click(function() {
        loads("packet");
    });
    jq("#money").click(function() {
        loads("money");
    });
    jq("#member").click(function() {
        loads("member");
    });
    jq("#result").click(function() {
        loads("result");
    });
    jq("#commission").click(function() {
        loads("commission");
    });
    jq("#cash").click(function() {
        loads("cash");
    });
    loads("user");



    function  loads(type) {
        jq("div.m_right").load("/DoMember","type="+type);
    }

});
