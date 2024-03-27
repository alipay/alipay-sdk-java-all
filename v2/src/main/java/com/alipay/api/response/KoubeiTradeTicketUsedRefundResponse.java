package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.used.refund response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-31 15:15:27
 */
public class KoubeiTradeTicketUsedRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6767386152124598781L;

	/** 
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
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
