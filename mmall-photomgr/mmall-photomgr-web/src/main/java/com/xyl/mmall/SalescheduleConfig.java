package com.xyl.mmall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@ImportResource({"classpath:config/applicationProvider.xml", "classpath:config/${spring.profiles.active}/ehcache-bean.xml"})
@ComponentScan
public class SalescheduleConfig {
	@Bean
	public CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		return filter;
	}
}