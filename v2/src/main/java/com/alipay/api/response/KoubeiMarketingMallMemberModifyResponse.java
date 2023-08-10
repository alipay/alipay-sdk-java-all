package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.member.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 19:59:53
 */
public class KoubeiMarketingMallMemberModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5332733728561779891L;

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
