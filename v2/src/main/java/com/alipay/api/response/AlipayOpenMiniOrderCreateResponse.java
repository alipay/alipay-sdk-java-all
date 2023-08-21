package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-11 16:01:39
 */
public class AlipayOpenMiniOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2736116647866466519L;

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
