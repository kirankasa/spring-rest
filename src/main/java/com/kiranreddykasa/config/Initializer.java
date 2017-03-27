package com.kiranreddykasa.config;
 
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
 
import javax.servlet.Filter;
 
/**
 * Created by kiran on 4/13/2015.
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { JPAConfig.class };
    }
 
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { AppConfiguration.class };
    }
 
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] { new HiddenHttpMethodFilter() };
    }
 
}