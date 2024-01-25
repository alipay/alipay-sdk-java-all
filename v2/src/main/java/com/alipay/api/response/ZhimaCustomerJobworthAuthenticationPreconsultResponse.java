package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.authentication.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-25 10:57:00
 */
public class ZhimaCustomerJobworthAuthenticationPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2754251571178479734L;

	/** 
	 * 预校验是否通过
	 */
	@ApiField("pre_check_success")
	private Boolean preCheckSuccess;

	/** 
	 * pre_check_success字段为false时，商户可以通过该字段获取校验不通过的具体原因
	 */
	@ApiField("reason")
	private String reason;

	public void setPreCheckSuccess(Boolean preCheckSuccess) {
		this.preCheckSuccess = preCheckSuccess;
	}
	public Boolean getPreCheckSuccess( ) {
		return this.preCheckSuccess;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
