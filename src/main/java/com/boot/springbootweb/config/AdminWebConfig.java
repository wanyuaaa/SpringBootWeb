package com.boot.springbootweb.config;

import com.boot.springbootweb.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wanyu
 * @create 2022-03-22 15:46
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")//静态资源也被拦截
                .excludePathPatterns("/","/login","/js/**","/css/**","/fonts/**","/images/**");
    }


}
