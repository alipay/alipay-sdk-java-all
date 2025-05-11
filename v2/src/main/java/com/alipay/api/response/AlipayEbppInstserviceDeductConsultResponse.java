package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 17:04:16
 */
public class AlipayEbppInstserviceDeductConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4267723126165124181L;

	/** 
	 * true代表可签约，false代表不可签约
	 */
	@ApiField("allow_sign")
	private String allowSign;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 扩展字段（JSON格式）
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 支付模式（PREPAID表示预付费，POSTPAID表示后付费）
	 */
	@ApiField("pay_mode")
	private String payMode;

	public void setAllowSign(String allowSign) {
		this.allowSign = allowSign;
	}
	public String getAllowSign( ) {
		return this.allowSign;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public String getPayMode( ) {
		return this.payMode;
	}

}
