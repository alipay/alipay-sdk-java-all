package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.signcard.existence.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayUserSigncardExistenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8758413194546223155L;

	/** 
	 * 是否已经签约快捷或卡通，只统计已激活的签约信息。T代表是，F代表否。
	 */
	@ApiField("sign_card_exist")
	private String signCardExist;

	public void setSignCardExist(String signCardExist) {
		this.signCardExist = signCardExist;
	}
	public String getSignCardExist( ) {
		return this.signCardExist;
	}

}
