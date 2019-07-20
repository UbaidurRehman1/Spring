package com.ubaid.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.ubaid.app")
@EnableWebMvc
@Import(com.ubaid.app.security.Config.class)
public class Config implements WebMvcConfigurer
{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{

//		registry.addResourceHandler("/resources/**").addResourceLocations("/resources");
		registry.addResourceHandler("/static/atapata/**").addResourceLocations("/resources/");

	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry)
	{
		registry.jsp("WEB-INF/views/", ".jsp");
	}
	
}
