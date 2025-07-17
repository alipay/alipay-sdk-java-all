package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.payment.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-26 16:12:26
 */
public class AlipayCommerceMedicalPaymentPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4665794666276449996L;

	/** 
	 * 激活医保电子凭证地址。当result=1时返回。如果请求参数中有callbackURL，那么当用户完成医保电子凭证激活操作后后自动回跳至callbackURL指向的页面
	 */
	@ApiField("active_url")
	private String activeUrl;

	/** 
	 * 建议的推进策略；商家可参考建议推进业务动作
	 */
	@ApiField("suggestion")
	private String suggestion;

	public void setActiveUrl(String activeUrl) {
		this.activeUrl = activeUrl;
	}
	public String getActiveUrl( ) {
		return this.activeUrl;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getSuggestion( ) {
		return this.suggestion;
	}

}
