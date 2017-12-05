/*
 * @(#)HomeController.java 2017. 11. 29.
 *
 * Copyright 2017 Naver Corp. All rights Reserved. 
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yst.study.controller;

import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sungtak.yoon@nhn.com
 * @since 2017. 11. 29.
 */
@RestController
@Slf4j
public class HomeController {
	@GetMapping("/")
	public Mono<String> hello() {
		log.info("### hello Web");
		return Mono.just("hello world");
	}

	@GetMapping("/list")
	public Flux<Integer> helloList() {
		return Flux.fromStream(IntStream.generate(() -> 100).boxed().limit(10));
	}
}
