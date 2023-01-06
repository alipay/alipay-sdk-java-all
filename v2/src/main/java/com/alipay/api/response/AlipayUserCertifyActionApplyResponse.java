package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.action.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:51:13
 */
public class AlipayUserCertifyActionApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6338356221966892541L;

	/** 
	 * 返回给商户的支付宝业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

}
