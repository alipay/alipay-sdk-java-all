package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复杂类型第四个
 *
 * @author auto create
 * @since 1.0, 2024-12-12 14:17:24
 */
public class RainyComplexTypesTheFourth extends AlipayObject {

	private static final long serialVersionUID = 6143918687285367433L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 基础参数
	 */
	@ApiField("tc_case")
	private String tcCase;

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

	public String getTcCase() {
		return this.tcCase;
	}
	public void setTcCase(String tcCase) {
		this.tcCase = tcCase;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
