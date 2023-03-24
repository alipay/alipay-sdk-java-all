package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.member.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:02:08
 */
public class KoubeiMarketingMallMemberModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5668328854682428891L;

	/** 
	 * true：成功，false：失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
