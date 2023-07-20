package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:51:56
 */
public class AlipayCommerceYuntaskConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8441359153386457654L;

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
