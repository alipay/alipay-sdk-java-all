package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流事件发送
 *
 * @author auto create
 * @since 1.0, 2019-01-21 21:06:29
 */
public class AntMerchantExpandTradeorderEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 2481787936313595535L;

	/**
	 * 物流事件：LOGISTICS_ORDER_PAID(支付成功)、LOGISTICS_ORDER_CANCEL(取消)、COURIER_RECEIVED_ORDER(配送员接单)、COURIER_ARRIVED_SHOP(配送员到店)、COURIER_OBTAINED_GOODS(配送员已取货)、COURIER_ARRIVED_DEST(配送员已到达目的地)、LOGISTICS_ORDER_CONFIRM(确认)
	 */
	@ApiField("event")
	private String event;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 订单ID；订单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
