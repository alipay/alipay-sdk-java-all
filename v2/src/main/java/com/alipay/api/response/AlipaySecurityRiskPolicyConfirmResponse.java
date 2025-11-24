package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.policy.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-03 16:57:40
 */
public class AlipaySecurityRiskPolicyConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5736413563492496957L;

	/** 
	 * 确认结果
	 */
	@ApiField("confirm_success")
	private Boolean confirmSuccess;

	/** 
	 * 成功或失败，本版本废弃
	 */
	@ApiField("success")
	private Boolean success;

	public void setConfirmSuccess(Boolean confirmSuccess) {
		this.confirmSuccess = confirmSuccess;
	}
	public Boolean getConfirmSuccess( ) {
		return this.confirmSuccess;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
