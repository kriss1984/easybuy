// JavaScript Document

var jq = jQuery.noConflict();
jq(function(){


    jq("body").on("mouseover mouseout",".leftNav ul li",function(event){
        if(event.type == "mouseover"){
            //鼠标悬浮
            jq(this).find(".fj").addClass("nuw");
            jq(this).find(".zj").show();
        }else if(event.type == "mouseout"){
            //鼠标离开
            jq(this).find(".fj").removeClass("nuw");
            jq(this).find(".zj").hide();

        }
    })





})
