package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.bill.msg.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-24 11:36:17
 */
public class AlipayCommerceBillMsgApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7254814855676286555L;

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
