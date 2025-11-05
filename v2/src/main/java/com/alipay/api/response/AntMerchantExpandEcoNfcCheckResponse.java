package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.eco.nfc.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-06 18:02:25
 */
public class AntMerchantExpandEcoNfcCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8292483976588365985L;

	/** 
	 * ture 可以绑定  false 不可以绑定
	 */
	@ApiField("allow_bind")
	private Boolean allowBind;

	/** 
	 * RISK_INTERCEPT 风控拦截不可绑定
NO_SIGN 未签约请先引导签约
TIME_OUT 超时可重试
UNKNOW 其它未知原因
	 */
	@ApiField("forbid_bind_reason")
	private String forbidBindReason;

	public void setAllowBind(Boolean allowBind) {
		this.allowBind = allowBind;
	}
	public Boolean getAllowBind( ) {
		return this.allowBind;
	}

	public void setForbidBindReason(String forbidBindReason) {
		this.forbidBindReason = forbidBindReason;
	}
	public String getForbidBindReason( ) {
		return this.forbidBindReason;
	}

}
