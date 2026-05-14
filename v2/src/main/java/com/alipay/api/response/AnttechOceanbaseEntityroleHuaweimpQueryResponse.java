package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.entityrole.huaweimp.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-18 17:40:23
 */
public class AnttechOceanbaseEntityroleHuaweimpQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6665529572645964997L;

	/** 
	 * 华为云客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName( ) {
		return this.customerName;
	}

}
