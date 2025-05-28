package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.kbpayment.payorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:05
 */
public class KoubeiTradeKbpaymentPayorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4264118769189874828L;

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
