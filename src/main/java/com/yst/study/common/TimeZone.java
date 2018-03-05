/*
 * @(#)TimeZone.java 2018. 03. 02.
 *
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.yst.study.common;

/**
 * @author sungtak.yoon@nhn.com
 * @since 2018. 03. 02.
 */
public enum TimeZone {
	Europe_London("Europe/London"),
	Asia_Seoul("Asia/Seoul");

	private String timeZoneName;

	TimeZone(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}

	public String getTimeZoneName() {
		return timeZoneName;
	}
}
