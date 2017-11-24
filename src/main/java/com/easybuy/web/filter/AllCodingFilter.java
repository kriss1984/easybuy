package com.easybuy.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 启动tomcat 初始页面
 * Created by Administrator on 2017/11/14.
 */
public class AllCodingFilter implements Filter{
    String charset=null;
    public void init(FilterConfig filterConfig) throws ServletException {
        String result=filterConfig.getInitParameter("charset");

        if (result!=null&&result.length()>0){
            charset=result;
        }else {
            charset="utf-8";
        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        request.setCharacterEncoding(charset);
        response.setCharacterEncoding(charset);
        response.setContentType("text/html;charset=utf-8");
        System.out.println("设置"+charset+"第一次过滤");
        filterChain.doFilter(request,response);
        System.out.println("设置"+charset+"第二次过滤");

    }

    public void destroy() {

    }
}
