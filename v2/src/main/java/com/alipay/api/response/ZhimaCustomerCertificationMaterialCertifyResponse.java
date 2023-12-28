package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.material.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:45:20
 */
public class ZhimaCustomerCertificationMaterialCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4632461948825989867L;

	/** 
	 * 本次认证的唯一标识，商户需要记录，后续的操作都需要用到
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 认证不通过的原因
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证是否通过,通过为true，不通过为false
	 */
	@ApiField("passed")
	private String passed;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}
	public String getFailedReason( ) {
		return this.failedReason;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
