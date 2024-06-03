package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OnlineRideSuperWalletData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.onlineride.superwallet.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-11 10:12:00
 */
public class AlipayCommerceTransportOnlinerideSuperwalletQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8358443512288181477L;

	/** 
	 * 返回的数据
	 */
	@ApiField("data")
	private OnlineRideSuperWalletData data;

	public void setData(OnlineRideSuperWalletData data) {
		this.data = data;
	}
	public OnlineRideSuperWalletData getData( ) {
		return this.data;
	}

}
