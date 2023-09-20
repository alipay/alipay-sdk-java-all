package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * uid-openid可选（必选）框必须一致
 *
 * @author auto create
 * @since 1.0, 2023-07-17 19:55:42
 */
public class AlipayBossProdTestMtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5525959243848987552L;

	/**
	 * test
	 */
	@ApiField("test_string")
	private String testString;

	/**
	 * test
	 */
	@ApiField("test_string_open_id")
	private String testStringOpenId;

	public String getTestString() {
		return this.testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}

	public String getTestStringOpenId() {
		return this.testStringOpenId;
	}
	public void setTestStringOpenId(String testStringOpenId) {
		this.testStringOpenId = testStringOpenId;
	}

}
