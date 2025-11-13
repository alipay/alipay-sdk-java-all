package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 强引用
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:54
 */
public class RainyComplexTypesTheNinth extends AlipayObject {

	private static final long serialVersionUID = 7692568167729692985L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("demo_case")
	private String demoCase;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	public String getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
