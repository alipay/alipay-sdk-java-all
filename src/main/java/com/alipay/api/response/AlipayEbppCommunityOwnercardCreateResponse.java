package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercard.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 17:31:31
 */
public class AlipayEbppCommunityOwnercardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3265433116243832654L;

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
