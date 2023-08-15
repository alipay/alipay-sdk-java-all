package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.rta.merchant.callback response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-15 19:06:45
 */
public class AnttechMorseMarketingRtaMerchantCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 6715841978443289422L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于问题定位
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
