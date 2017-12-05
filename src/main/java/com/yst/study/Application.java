/*
 * @(#)Application.java 2017. 11. 29.
 *
 * Copyright 2017 Naver Corp. All rights Reserved. 
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yst.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sungtak.yoon@nhn.com
 * @since 2017. 11. 29.
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
