package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备订单状态
 *
 * @author auto create
 * @since 1.0, 2021-01-28 22:53:36
 */
public class DeviceOrderStatus extends AlipayObject {

	private static final long serialVersionUID = 4734461199969467576L;

	/**
	 * 设备订单状态
已下发 SYNC:20
已打印 PRINT:30
	 */
	@ApiField("device_order_status")
	private Long deviceOrderStatus;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 到店订单类型:SHOP_SERVICE
到家订单类型:HOME_SERVICE
	 */
	@ApiField("order_type")
	private String orderType;

	public Long getDeviceOrderStatus() {
		return this.deviceOrderStatus;
	}
	public void setDeviceOrderStatus(Long deviceOrderStatus) {
		this.deviceOrderStatus = deviceOrderStatus;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
