package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmorder.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-19 19:56:40
 */
public class AlipayMerchantMrchsurplmorderPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1876724264912245683L;

	/** 
	 * 是否允许继续下单
	 */
	@ApiField("allowed")
	private Boolean allowed;

	/** 
	 * 咨询不允许下单的原因的code
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/** 
	 * 如果不允许继续下单的原因是什么
	 */
	@ApiField("reason_desc")
	private String reasonDesc;

	public void setAllowed(Boolean allowed) {
		this.allowed = allowed;
	}
	public Boolean getAllowed( ) {
		return this.allowed;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReasonCode( ) {
		return this.reasonCode;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}
	public String getReasonDesc( ) {
		return this.reasonDesc;
	}

}
