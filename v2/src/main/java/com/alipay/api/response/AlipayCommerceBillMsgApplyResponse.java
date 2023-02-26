package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.bill.msg.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:21:37
 */
public class AlipayCommerceBillMsgApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6829157777158885147L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
