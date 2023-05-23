package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.bill.msg.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:21:53
 */
public class AlipayCommerceBillMsgApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5586127641361217525L;

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
