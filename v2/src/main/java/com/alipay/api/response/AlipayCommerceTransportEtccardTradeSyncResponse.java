package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etccard.trade.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-08 16:57:21
 */
public class AlipayCommerceTransportEtccardTradeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1357957972121781913L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("biz_no")
	private Long bizNo;

	public void setBizNo(Long bizNo) {
		this.bizNo = bizNo;
	}
	public Long getBizNo( ) {
		return this.bizNo;
	}

}
