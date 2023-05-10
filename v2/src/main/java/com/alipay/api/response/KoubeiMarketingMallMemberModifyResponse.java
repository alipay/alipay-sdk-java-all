package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.member.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:35:33
 */
public class KoubeiMarketingMallMemberModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6516332356394212269L;

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
