package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 1.0无参数
 *
 * @author auto create
 * @since 1.0, 2025-01-22 15:23:12
 */
public class RainyComplexTypesTheFifteen extends AlipayObject {

	private static final long serialVersionUID = 3249777529811151363L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("must_case")
	private String mustCase;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("tc_case")
	private String tcCase;

	public String getMustCase() {
		return this.mustCase;
	}
	public void setMustCase(String mustCase) {
		this.mustCase = mustCase;
	}

	public String getTcCase() {
		return this.tcCase;
	}
	public void setTcCase(String tcCase) {
		this.tcCase = tcCase;
	}

}
