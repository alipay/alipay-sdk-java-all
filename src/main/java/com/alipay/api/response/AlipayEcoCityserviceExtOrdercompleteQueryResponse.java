package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.ext.ordercomplete.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-30 10:16:36
 */
public class AlipayEcoCityserviceExtOrdercompleteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6856748829518735194L;

	/** 
	 * 交易订单是否完成计费 收费字段。 
1 未核销
2 已核销
	 */
	@ApiField("order_complete_status")
	private String orderCompleteStatus;

	/** 
	 * 退款请求号，当order_type=2时必传。 标识一次退款请求，需要保证在外部交易号下唯一。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 商户订单号，最大长度64字符，需保证商户侧不重复。注意：退费时该参数需要和收费时保持一致，否则无法退费
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public void setOrderCompleteStatus(String orderCompleteStatus) {
		this.orderCompleteStatus = orderCompleteStatus;
	}
	public String getOrderCompleteStatus( ) {
		return this.orderCompleteStatus;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

}
