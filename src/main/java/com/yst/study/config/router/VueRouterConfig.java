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
				RequestPredicates.GET("/condition"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("condition")
			).andRoute(
				RequestPredicates.GET("/ch4/event"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("vue/chapter4/event")
			).andRoute(
				RequestPredicates.GET("/ch4/bubbling"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("vue/chapter4/bubbling")
			).andRoute(
				RequestPredicates.GET("/ch4/copy"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("vue/chapter4/copyAndPaste")
			).andRoute(
				RequestPredicates.GET("/ch5/class"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("vue/chapter5/classBind")
			).andRoute(
				RequestPredicates.GET("/ch5/todo"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("vue/chapter5/todo")
			).andRoute(
				RequestPredicates.GET("/jquery/click"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("vue/jquery/jqueryAndVue")
			)
		);
	}
}
