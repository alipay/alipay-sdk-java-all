package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试文档预览msgAaiTo
 *
 * @author auto create
 * @since 1.0, 2023-09-26 18:04:32
 */
public class AlipaySecurityProdDemoTestSetModel extends AlipayObject {

	private static final long serialVersionUID = 7788711588782497144L;

	/**
	 * 1
	 */
	@ApiField("test_date")
	private String testDate;

	/**
	 * 1 当前字段已废弃(1111111111111111)
	 */
	@ApiField("test_number")
	@Deprecated
	private String testNumber;

	/**
	 * 1
	 */
	@ApiField("test_price")
	private String testPrice;

	/**
	 * 1
	 */
	@ApiField("test_string")
	private String testString;

	/**
	 * 1
	 */
	@ApiField("test_string_open_id")
	private String testStringOpenId;

	public String getTestDate() {
		return this.testDate;
	}
	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	public String getTestNumber() {
		return this.testNumber;
	}
	public void setTestNumber(String testNumber) {
		this.testNumber = testNumber;
	}

	public String getTestPrice() {
		return this.testPrice;
	}
	public void setTestPrice(String testPrice) {
		this.testPrice = testPrice;
	}

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
