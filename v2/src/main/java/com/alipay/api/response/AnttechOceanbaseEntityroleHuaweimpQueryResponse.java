package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.entityrole.huaweimp.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-15 11:42:00
 */
public class AnttechOceanbaseEntityroleHuaweimpQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2565996559723434861L;

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
