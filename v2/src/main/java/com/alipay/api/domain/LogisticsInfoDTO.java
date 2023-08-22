package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息模型
 *
 * @author auto create
 * @since 1.0, 2023-06-29 13:35:45
 */
public class LogisticsInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2859727414426786914L;

	/**
	 * 配送时间
	 */
	@ApiField("delivery_time")
	private Date deliveryTime;

	/**
	 * 物流类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	public Date getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}
