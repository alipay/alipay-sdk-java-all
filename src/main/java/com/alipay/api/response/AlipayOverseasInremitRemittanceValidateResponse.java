package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.inremit.remittance.validate response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasInremitRemittanceValidateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8172825638729746368L;

	/** 
	 * 验证是否成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

}
