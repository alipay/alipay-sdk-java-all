package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercard.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:46:46
 */
public class AlipayEbppCommunityOwnercardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2197858897182356215L;

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
