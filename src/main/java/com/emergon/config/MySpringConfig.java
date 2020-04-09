package com.emergon.config;

import com.emergon.converter.StringToBreadSizeConverter;
import com.emergon.converter.StringToIngredientConverter;
import com.emergon.converter.StringToPaymentConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.emergon")
public class MySpringConfig implements WebMvcConfigurer{
   
    @Autowired
    StringToBreadSizeConverter stringToBreadSizeConverter;
    @Autowired
    StringToIngredientConverter stringToIngredientConverter;
    @Autowired
    StringToPaymentConverter stringToPaymentConverter;
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(stringToBreadSizeConverter);
        registry.addConverter(stringToIngredientConverter);
        registry.addConverter(stringToPaymentConverter);
    }
}