package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.bill.event.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 13:45:44
 */
public class AlipayCommerceBillEventTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 3631454558757358848L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
