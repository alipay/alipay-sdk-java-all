package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.open.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-22 16:17:08
 */
public class AlipayCommerceMerchantcardOpenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2587113314316782572L;

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
