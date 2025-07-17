package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.tradeorder.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:24:59
 */
public class AntMerchantExpandTradeorderEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8629199584232731978L;

	/** 
	 * 物流单状态：WAIT_PAY(待支付)、PAID(已支付)、WAIT_PAY_TIMEOUT(超时未支付)、COURIER_CONFIRMED(快递员已接单)、COURIER_ARRIVED_SEND(快递员已到达寄送点)、GOODS_PICKED(已取件)、GOODS_DELIVERED(已送达)、FINISHED(已完结)
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/** 
	 * 订单状态：PAID(已支付)、CANCEL_CLOSED(取消关闭)、SUCCESS_FINISHED(成功完结)、TIMEOUT_CLOSED(超时关闭)
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}
	public String getLogisticsStatus( ) {
		return this.logisticsStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
