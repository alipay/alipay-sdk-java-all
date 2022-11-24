package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-16 19:26:35
 */
public class AlipayCommerceYuntaskConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7616625387471877342L;

	/** 
	 * 执行成功结果
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
