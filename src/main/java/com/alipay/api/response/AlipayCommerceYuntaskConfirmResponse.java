package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-24 09:51:39
 */
public class AlipayCommerceYuntaskConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6574617268779953421L;

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
