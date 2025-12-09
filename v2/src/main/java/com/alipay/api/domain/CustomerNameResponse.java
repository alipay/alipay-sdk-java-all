package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出参
 *
 * @author auto create
 * @since 1.0, 2025-12-01 19:27:41
 */
public class CustomerNameResponse extends AlipayObject {

	private static final long serialVersionUID = 1341322178282723671L;

	/**
	 * 常用名
	 */
	@ApiField("customer_short_name")
	private String customerShortName;

	/**
	 * 客户名称
	 */
	@ApiField("ep_name")
	private String epName;

	public String getCustomerShortName() {
		return this.customerShortName;
	}
	public void setCustomerShortName(String customerShortName) {
		this.customerShortName = customerShortName;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

}
