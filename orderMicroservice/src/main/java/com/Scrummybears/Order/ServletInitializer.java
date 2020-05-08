package com.Scrummybears.Order;

import com.Scrummybears.OrderApplication;
import com.Scrummybears.OrderModel.Item;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OrderApplication.class);
	}

}
