package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:04:43
 */
public class LogisticsFacadeResponse extends AlipayObject {

	private static final long serialVersionUID = 8547953816652228466L;

	/**
	 * 物流状态
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/**
	 * 快递单号
	 */
	@ApiField("tracking_number")
	private String trackingNumber;

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getTrackingNumber() {
		return this.trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

}
