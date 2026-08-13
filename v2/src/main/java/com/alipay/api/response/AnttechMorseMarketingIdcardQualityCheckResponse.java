package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.idcard.quality.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-12 22:47:53
 */
public class AnttechMorseMarketingIdcardQualityCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5227679572682948371L;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 质检结果
	 */
	@ApiField("check_result")
	private String checkResult;

	/** 
	 * 是否允许降级处理。取值true时表示当前请求采用降级模式，取值false时表示采用正常模式
	 */
	@ApiField("fallback")
	private Boolean fallback;

	/** 
	 * 质检是否通过（降级放行时为 true）
	 */
	@ApiField("passed")
	private Boolean passed;

	/** 
	 * 用户可见原因
	 */
	@ApiField("reason")
	private String reason;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getCheckResult( ) {
		return this.checkResult;
	}

	public void setFallback(Boolean fallback) {
		this.fallback = fallback;
	}
	public Boolean getFallback( ) {
		return this.fallback;
	}

	public void setPassed(Boolean passed) {
		this.passed = passed;
	}
	public Boolean getPassed( ) {
		return this.passed;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
