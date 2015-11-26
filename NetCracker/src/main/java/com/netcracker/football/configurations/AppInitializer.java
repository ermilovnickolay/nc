package com.netcracker.football.configurations;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {

		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();

		annotationConfigWebApplicationContext
				.register(ApplicationConfigurator.class);
		annotationConfigWebApplicationContext.setServletContext(servletContext);

		servletContext.addListener(new ContextLoaderListener(
				annotationConfigWebApplicationContext));
		servletContext.addListener(new RequestContextListener());

		Dynamic dynamic = servletContext.addServlet("dispatcher",
				new DispatcherServlet(annotationConfigWebApplicationContext));
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(NumberUtils.INTEGER_ONE);
	}

}
