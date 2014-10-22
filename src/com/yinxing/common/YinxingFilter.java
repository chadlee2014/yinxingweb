package com.yinxing.common;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class YinxingFilter extends StrutsPrepareAndExecuteFilter{ 
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) { 
        HttpServletRequest request = (HttpServletRequest) req; 
        String url = request.getRequestURI();
        try{ 
            if ("/yinxingweb/kindeditor/jsp/upload_json.jsp".equals(url)) { 
                chain.doFilter(req, res); 
                //System.out.println("it is my filter");
                System.out.println("if");
            } else { 
            	System.out.println("else");
                super.doFilter(req, res, chain); 
                //System.out.println("it is not my filter~~~~~~~~~"+url);
                
            } 
        }catch(Exception e){
            System.out.println("Exception in MyStrutsFilter");
            e.printStackTrace(); 
        } 
    } 
}
