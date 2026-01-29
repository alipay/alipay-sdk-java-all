package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易购买订单返回模型
 *
 * @author auto create
 * @since 1.0, 2026-01-05 10:29:45
 */
public class OrderBuyResponse extends AlipayObject {

	private static final long serialVersionUID = 3882888311591677461L;

	/**
	 * 交易组件订单号。可以把获取到的order_id作为alipay.trade.create（统一收单交易创建接口）extend_params.trade_component_order_id的入参进行关联。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 创单扩展信息
	 */
	@ApiField("pay_info_response")
	private PayInfoResponse payInfoResponse;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public PayInfoResponse getPayInfoResponse() {
		return this.payInfoResponse;
	}
	public void setPayInfoResponse(PayInfoResponse payInfoResponse) {
		this.payInfoResponse = payInfoResponse;
	}

}
