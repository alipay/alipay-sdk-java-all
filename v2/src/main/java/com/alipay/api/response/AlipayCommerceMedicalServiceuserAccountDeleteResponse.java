package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceuser.account.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-24 20:22:56
 */
public class AlipayCommerceMedicalServiceuserAccountDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2871937849381884915L;

	/** 
	 * 数据结果
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
