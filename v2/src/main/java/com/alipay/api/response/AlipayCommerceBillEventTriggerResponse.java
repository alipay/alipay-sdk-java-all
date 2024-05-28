package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.bill.event.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-14 15:42:01
 */
public class AlipayCommerceBillEventTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 8715957875927325424L;

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
