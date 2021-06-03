package com.lts.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyMvcConfig implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language=request.getParameter("l");

//        如果没有就是默认的语言
        Locale locale=Locale.getDefault();

//        如果请求资源携带了连接请求
        if(StringUtils.hasText(language)){
//            zh_CN
            String[] split=language.split("_");
//              国家，地区
            locale=new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }

}
