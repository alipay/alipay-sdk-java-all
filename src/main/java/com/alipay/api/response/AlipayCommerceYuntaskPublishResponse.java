package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.publish response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-24 09:51:38
 */
public class AlipayCommerceYuntaskPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 4676716793187358833L;

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
