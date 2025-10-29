package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试toAntApi
 *
 * @author auto create
 * @since 1.0, 2025-08-13 14:28:23
 */
public class AlipayDataToanthqtestSendModel extends AlipayObject {

	private static final long serialVersionUID = 6718941241846228184L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 测试
	 */
	@ApiField("test")
	private String test;

	/**
	 * 测试复杂类型
	 */
	@ApiListField("test_complex")
	@ApiField("test_hq")
	private List<TestHq> testComplex;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

	public List<TestHq> getTestComplex() {
		return this.testComplex;
	}
	public void setTestComplex(List<TestHq> testComplex) {
		this.testComplex = testComplex;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
