package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.paysaas.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-26 11:02:27
 */
public class AlipayOfflinePaysaasOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4453865539328148873L;

	/** 
	 * 给外部订单生成的唯一单号
	 */
	@ApiField("isv_order_no")
	private String isvOrderNo;

	/** 
	 * 收款订单状态，用于服务商收银机展示收款状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setIsvOrderNo(String isvOrderNo) {
		this.isvOrderNo = isvOrderNo;
	}
	public String getIsvOrderNo( ) {
		return this.isvOrderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
