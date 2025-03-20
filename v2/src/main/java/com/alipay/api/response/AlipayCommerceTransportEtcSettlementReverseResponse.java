package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.settlement.reverse response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 18:41:14
 */
public class AlipayCommerceTransportEtcSettlementReverseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1342978753557349464L;

	/** 
	 * 商户行程单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 交易状态：仅“C”代表撤销完成，其他参考交易状态</br>
"I":"待支付，未撤销完成"; </br>
"PI":"支付中，未撤销完成"; </br>
"S":"支付成功，未撤销完成"; </br>
"F":"支付失败，未撤销完成"; </br>
"RI":"退款中，不支持撤销"; </br>
"R":"已退款，不支持撤销";</br>
"C":"已撤销，说明撤销完成";</br>
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
