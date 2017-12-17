/*
 * @(#)VueRouter.java 2017. 12. 10.
 *
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yst.study.config.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author sungtak.yoon@nhn.com
 * @since 2017. 12. 10.
 */
@Configuration
public class VueRouterConfig {
	@Bean
	public RouterFunction<ServerResponse> vueRouterFunction() {
		return RouterFunctions.nest(
			RequestPredicates.GET("/vue"),
			RouterFunctions.route(
				RequestPredicates.GET("/loop"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("loop")
			).andRoute(
				RequestPredicates.GET("/compute"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("compute")
			).andRoute(
				RequestPredicates.GET("/lifecycle"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("lifecycle")
			).andRoute(
				RequestPredicates.GET("/ch4/event"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("vue/chapter4/event")
			)
		);
	}
}
