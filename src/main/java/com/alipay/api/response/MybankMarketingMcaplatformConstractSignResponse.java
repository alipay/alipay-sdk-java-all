package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.mcaplatform.constract.sign response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-27 11:55:39
 */
public class MybankMarketingMcaplatformConstractSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4567638634593193899L;

	/** 
	 * 签约返回结果，绿色经营签约场景
	 */
	@ApiField("sign_result")
	private Boolean signResult;

	public void setSignResult(Boolean signResult) {
		this.signResult = signResult;
	}
	public Boolean getSignResult( ) {
		return this.signResult;
	}

}
