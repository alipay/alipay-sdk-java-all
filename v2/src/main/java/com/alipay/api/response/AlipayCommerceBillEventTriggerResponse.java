package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.bill.event.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 20:52:05
 */
public class AlipayCommerceBillEventTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 2759315338958849871L;

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
