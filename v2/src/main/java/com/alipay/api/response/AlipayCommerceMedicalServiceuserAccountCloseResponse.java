package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceuser.account.close response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 18:12:56
 */
public class AlipayCommerceMedicalServiceuserAccountCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6556641167593981765L;

	/** 
	 * 获取签名后的业务数据
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
