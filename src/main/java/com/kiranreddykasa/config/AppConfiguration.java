package com.kiranreddykasa.config;
 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 
/**
 * Created by kiran on 4/13/2015.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.kiranreddykasa")
public class AppConfiguration extends WebMvcConfigurerAdapter {
}