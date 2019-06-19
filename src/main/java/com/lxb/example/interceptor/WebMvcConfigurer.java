package com.lxb.example.interceptor;

import com.lxb.example.interceptor.interceptors.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author xiaobin.lang
 * @create 2019-03-19 14:00
 * @desc 拦截器注册
 **/
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    /**
     * <p>Title:</p>
     * <p>Description:重写增加自定义拦截器的注册，某一个拦截器需要先注册进来，才能工作</p>
     * param[1]: null
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");

//        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/one/**")
//                .addPathPatterns("/two/**");

        super.addInterceptors(registry);
    }
}
