package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.ep.certification.certify response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-10 10:17:20
 */
public class ZhimaCustomerEpCertificationCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6118135227137724415L;

	/** 
	 * 一次认证的唯一标识，在商户调用认证初始化接口的时候获取，认证完成返回的biz_no和请求的一致
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 认证不通过的原因
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证是否通过。通过为true，不通过为false
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
