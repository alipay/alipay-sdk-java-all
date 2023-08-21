package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercard.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:01:48
 */
public class AlipayEbppCommunityOwnercardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3668255121159375514L;

	/** 
	 * 支付宝证件id
	 */
	@ApiField("alipay_card_id")
	private String alipayCardId;

	public void setAlipayCardId(String alipayCardId) {
		this.alipayCardId = alipayCardId;
	}
	public String getAlipayCardId( ) {
		return this.alipayCardId;
	}

}
