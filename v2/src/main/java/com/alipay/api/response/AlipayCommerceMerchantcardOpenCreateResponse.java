package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.open.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:31:10
 */
public class AlipayCommerceMerchantcardOpenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7785298173934368887L;

	/** 
	 * 提交失败的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 商户二级类目code
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/** 
	 * 商户二级类目名称
	 */
	@ApiField("mcc_name")
	private String mccName;

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

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}
	public String getMccCode( ) {
		return this.mccCode;
	}

	public void setMccName(String mccName) {
		this.mccName = mccName;
	}
	public String getMccName( ) {
		return this.mccName;
	}

	public void setSubmitResult(Boolean submitResult) {
		this.submitResult = submitResult;
	}
	public Boolean getSubmitResult( ) {
		return this.submitResult;
	}

}
