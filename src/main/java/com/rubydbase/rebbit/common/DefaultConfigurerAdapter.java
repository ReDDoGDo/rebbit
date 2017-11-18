package com.rubydbase.rebbit.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class DefaultConfigurerAdapter extends WebMvcConfigurerAdapter{
	
	private static final Logger logger = LoggerFactory.getLogger(DefaultConfigurerAdapter.class);
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		logger.info("start set Default View Path");
        registry.addViewController("/").setViewName("forward:/index");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new DefaultInterceptor()).addPathPatterns("/*");
	}

}
