package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercard.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:51:38
 */
public class AlipayEbppCommunityOwnercardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6125351864641832182L;

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
