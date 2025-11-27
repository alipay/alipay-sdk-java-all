package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约更新信息
 *
 * @author auto create
 * @since 1.0, 2025-04-01 11:24:56
 */
public class MiniDeliveryInfoUpdateDTO extends AlipayObject {

	private static final long serialVersionUID = 1521456214252882952L;

	/**
	 * 履约结束时间
	 */
	@ApiField("delivery_end_time")
	private Date deliveryEndTime;

	/**
	 * 履约开始时间
	 */
	@ApiField("delivery_start_time")
	private Date deliveryStartTime;

	public Date getDeliveryEndTime() {
		return this.deliveryEndTime;
	}
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

	public Date getDeliveryStartTime() {
		return this.deliveryStartTime;
	}
	public void setDeliveryStartTime(Date deliveryStartTime) {
		this.deliveryStartTime = deliveryStartTime;
	}

}
