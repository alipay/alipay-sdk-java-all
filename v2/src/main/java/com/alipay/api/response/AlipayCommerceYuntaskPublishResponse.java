package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.publish response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 17:26:02
 */
public class AlipayCommerceYuntaskPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3821777919933781848L;

	/** 
	 * 执行成功
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
