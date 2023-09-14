package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.order.store.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:33
 */
public class AntMerchantOrderStoreCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3666114414225531322L;

	/** 
	 * 订单的ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单的状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
