package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.publish response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:11:37
 */
public class AlipayCommerceYuntaskPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 1692428849711634526L;

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
