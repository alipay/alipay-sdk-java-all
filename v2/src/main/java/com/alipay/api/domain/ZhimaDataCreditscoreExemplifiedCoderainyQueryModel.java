package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 示例化代码API01
 *
 * @author auto create
 * @since 1.0, 2024-07-09 16:19:01
 */
public class ZhimaDataCreditscoreExemplifiedCoderainyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2233964757381188173L;

	/**
	 * 基础类型-Boolean
	 */
	@ApiField("boolean_a")
	private Boolean booleanA;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 简单描述
	 */
	@ApiField("string_a")
	private String stringA;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("testcase_openid")
	private String testcaseOpenid;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("uid")
	private String uid;

	public Boolean getBooleanA() {
		return this.booleanA;
	}
	public void setBooleanA(Boolean booleanA) {
		this.booleanA = booleanA;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getStringA() {
		return this.stringA;
	}
	public void setStringA(String stringA) {
		this.stringA = stringA;
	}

	public String getTestcaseOpenid() {
		return this.testcaseOpenid;
	}
	public void setTestcaseOpenid(String testcaseOpenid) {
		this.testcaseOpenid = testcaseOpenid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
