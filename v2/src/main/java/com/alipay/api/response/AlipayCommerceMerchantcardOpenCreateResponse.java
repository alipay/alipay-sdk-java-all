package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.open.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 11:51:02
 */
public class AlipayCommerceMerchantcardOpenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7525549663848364746L;

	/** 
	 * 提交失败的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 开通是否成功
	 */
	@ApiField("submit_result")
	private Boolean submitResult;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setSubmitResult(Boolean submitResult) {
		this.submitResult = submitResult;
	}
	public Boolean getSubmitResult( ) {
		return this.submitResult;
	}

}
