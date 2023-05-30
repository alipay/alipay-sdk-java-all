package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.ownercard.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:21:49
 */
public class AlipayEbppCommunityOwnercardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8764855788637215334L;

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
