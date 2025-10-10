package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询结果
 *
 * @author auto create
 * @since 1.0, 2025-04-28 14:17:28
 */
public class JhTestResultData extends AlipayObject {

	private static final long serialVersionUID = 6767447141976526765L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 结果
	 */
	@ApiField("test_result")
	private String testResult;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTestResult() {
		return this.testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

}
