package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi-oas3.0灰度
 *
 * @author auto create
 * @since 1.0, 2022-12-08 17:45:54
 */
public class AlipayOpenAppTestGrayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8885268731124863876L;

	/**
	 * a
	 */
	@ApiField("a")
	private String a;

	/**
	 * 生
	 */
	@ApiField("b")
	private String b;

	/**
	 * b1
	 */
	@ApiField("body")
	private String body;

	/**
	 * body
	 */
	@ApiField("body_1")
	private String body1;

	/**
	 * c1
	 */
	@ApiField("c")
	private String c;

	/**
	 * xx
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiField("user_id")
	private String userId;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getBody1() {
		return this.body1;
	}
	public void setBody1(String body1) {
		this.body1 = body1;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
