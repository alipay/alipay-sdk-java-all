package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.promotion.dynamicurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:49
 */
public class MybankCreditLoanapplyPromotionDynamicurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8224468884547299897L;

	/** 
	 * 推广活动需要跳转的动态链接地址
	 */
	@ApiField("dynamic_url")
	private String dynamicUrl;

	public void setDynamicUrl(String dynamicUrl) {
		this.dynamicUrl = dynamicUrl;
	}
	public String getDynamicUrl( ) {
		return this.dynamicUrl;
	}

}
