/*
 * @(#)SpringConfig.java 2017. 11. 29.
 *
 * Copyright 2017 Naver Corp. All rights Reserved. 
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yst.study.config;

import java.util.HashMap;
import java.util.stream.IntStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sungtak.yoon@nhn.com
 * @since 2017. 11. 29.
 */
@Configuration
@ComponentScan
public class SpringConfig {
	@Bean
	public RouterFunction<ServerResponse> helloRouter() {
		return RouterFunctions.route(
			RequestPredicates.GET("/react"),
			serverRequest -> ServerResponse.ok().body(Mono.just("react flux hello"), String.class)
		).andRoute(
			RequestPredicates.GET("/react/list"),
			serverRequest -> ServerResponse.ok().body(Flux.fromStream(IntStream.generate(() -> 100).boxed().limit(10)), Integer.class)
		).andNest(
			RequestPredicates.GET("/nest"),
			RouterFunctions.route(
				RequestPredicates.GET("/react"),
				serverRequest -> ServerResponse.ok().body(Mono.just("react flux hello"), String.class)
			)
		).andRoute(
			RequestPredicates.GET("/todo"),
			serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("todo", new HashMap<>())
		).andRoute(
			RequestPredicates.GET("/condition"),
			serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("condition")
		).andNest(
			RequestPredicates.GET("/vue"),
			RouterFunctions.route(
				RequestPredicates.GET("/loop"),
				serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("loop")
			)
		);
	}
}
