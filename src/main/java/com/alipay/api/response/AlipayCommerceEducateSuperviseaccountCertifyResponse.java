package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.superviseaccount.certify response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-31 15:41:46
 */
public class AlipayCommerceEducateSuperviseaccountCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4658983222158985149L;

	/** 
	 * 蚂蚁统一会员ID，仅当校验成功时才会返回
	 */
	@ApiField("user_id")
	private String userId;

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
