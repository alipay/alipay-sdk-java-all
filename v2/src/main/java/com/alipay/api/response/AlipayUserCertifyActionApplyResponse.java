package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.action.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 14:47:37
 */
public class AlipayUserCertifyActionApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1417837235526725262L;

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
