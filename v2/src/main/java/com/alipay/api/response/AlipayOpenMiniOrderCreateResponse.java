package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-26 17:46:57
 */
public class AlipayOpenMiniOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8547725939218821157L;

	/** 
	 * 交易组件订单号。可以把获取到的order_id作为<a href="https://opendocs.alipay.com/mini/05x9kv?scene=de4d6a1e0c6e423b9eefa7c3a6dcb7a5&pathHash=779dc517">alipay.trade.create（统一收单交易创建接口）</a>extend_params.trade_component_order_id的入参进行关联。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

}
