/**
 * Created by Administrator on 2017/11/20.
 */
var jq = jQuery.noConflict();
jq(function () {
    /*------------------------初始页面-----------------------------*/
    jq.getJSON("/IndexSevrlet",function(dataOne) {
        /*-------------------------请登录换成用户名--------------------------------*/


        /*-------------------------请登录换成用户名--------------------------------*/
        /*-----------------侧边栏的信息----------------------------*/
            var k=0;
        for ( var i=0; i<dataOne.listOne.length;i++){
            jq(".floor_num").next().eq(k).html(dataOne.listOne[++i]);//插入商品种类数据
            k++;
        }
        /*----------------------侧边栏的图片下面的信息 和二级ProductId--------------------------*/
        var w=0;
        for(var i=0; i<dataOne.twoNameCategory.length;i++){
          var names=dataOne.twoNameCategory[i].split(',');
            for(var j=0; j<names.length;j++){
                if(names[j]!="") {
                    jq(".fresh_txt_c").eq(i).append("<a href='#' name="+dataOne.twoProductId[w]+">" + names[j] + "</a>")
                    w++;
                }
            }
        }
        /*----------------------侧边栏的图片下面的信息 和二级ProductId--------------------------*/
        /*-----------------侧边栏的信息----------------------------*/
        /*------------------新闻资讯查询最新5条信息--------------------*/
        for(var i=0;i<dataOne.listNews.length;i++){
            // alert(dataOne.listNews[i].id);
            jq(".inews ul li a").eq(i).attr("name",dataOne.listNews[i].id);
            jq(".inews ul li a").eq(i).html(dataOne.listNews[i].title);
        }
        /*------------------新闻资讯查询最新5条信息----------------*/
        /*----------------------推荐商品--------------------------*/

         for(var j=0;j<dataOne.listProduct.length;j++){
             jq(".fresh_mid ul li .name a").eq(j).html(dataOne.listProduct[j].name);//名称
             jq(".fresh_mid ul li .name a").eq(j).attr({name:dataOne.listProduct[j].id,href:"/ProductServlet?productId="+dataOne.listProduct[j].id});
             jq(".fresh_mid ul li .price span").eq(j).html(dataOne.listProduct[j].price);//金钱
             jq(".fresh_mid ul li .img img").eq(j).attr({src:"../imgfiles/"+dataOne.listProduct[j].fileName,name:dataOne.listProduct[j].id});//图片
             jq(".fresh_mid ul li .img a").eq(j).attr("href","/ProductServlet?productId="+dataOne.listProduct[j].id);
         }
        /*----------------------推荐商品--------------------------*/
    });
    /*------------------------初始页面-----------------------------*/

    /*------------------------点击图片跳转到Product.jsp-----------------------------*/


    /*------------------------点击图片跳转到Product.jsp-----------------------------*/



});
