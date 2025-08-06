package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 强引用
 *
 * @author auto create
 * @since 1.0, 2025-03-07 19:52:24
 */
public class RainyComplexTypesTheNinth extends AlipayObject {

	private static final long serialVersionUID = 5379315389334883334L;

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
