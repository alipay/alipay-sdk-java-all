package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.bill.msg.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:47:41
 */
public class AlipayCommerceBillMsgApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6877821399212512677L;

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
