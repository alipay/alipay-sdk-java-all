package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invmode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:17:35
 */
public class AlipayBossFncInvmodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6526328919198388833L;

	/** 
	 * 是否调用成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
