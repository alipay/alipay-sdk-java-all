package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.kbpayment.payorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:51:22
 */
public class KoubeiTradeKbpaymentPayorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5791963144147563184L;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
