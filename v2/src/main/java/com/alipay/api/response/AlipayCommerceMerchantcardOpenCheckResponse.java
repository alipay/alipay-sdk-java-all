package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.open.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:31:12
 */
public class AlipayCommerceMerchantcardOpenCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5713457155954532854L;

	/** 
	 * 预校验是否通过
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	/** 
	 * 预校验失败的原因
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

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}
	public Boolean getCheckResult( ) {
		return this.checkResult;
	}

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

}
