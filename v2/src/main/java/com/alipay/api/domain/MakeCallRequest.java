package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起外呼请求
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:43:16
 */
public class MakeCallRequest extends AlipayObject {

	private static final long serialVersionUID = 8395993649764997682L;

	/**
	 * 被叫电话号码
	 */
	@ApiField("callee")
	private String callee;

	/**
	 * 脱敏后的被叫电话号码
	 */
	@ApiField("mask_callee")
	private String maskCallee;

	/**
	 * 坐席用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCallee() {
		return this.callee;
	}
	public void setCallee(String callee) {
		this.callee = callee;
	}

	public String getMaskCallee() {
		return this.maskCallee;
	}
	public void setMaskCallee(String maskCallee) {
		this.maskCallee = maskCallee;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
