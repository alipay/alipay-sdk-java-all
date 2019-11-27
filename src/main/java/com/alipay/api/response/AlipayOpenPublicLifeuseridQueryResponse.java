package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.lifeuserid.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicLifeuseridQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5852951742671765396L;

	/** 
	 * 支付宝生活号用户ID
	 */
	@ApiField("life_uid")
	private String lifeUid;

	public void setLifeUid(String lifeUid) {
		this.lifeUid = lifeUid;
	}
	public String getLifeUid( ) {
		return this.lifeUid;
	}

}
