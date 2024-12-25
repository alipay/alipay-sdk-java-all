package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约信息模型
 *
 * @author auto create
 * @since 1.0, 2023-12-28 14:41:46
 */
public class DeliveryFulfillmentVO extends AlipayObject {

	private static final long serialVersionUID = 5139715266799786656L;

	/**
	 * 发货频次
	 */
	@ApiField("delivery_frequency")
	private Long deliveryFrequency;

	/**
	 * 总发货期数
	 */
	@ApiField("total_delivery_times")
	private Long totalDeliveryTimes;

	/**
	 * 频次单位
WEEK：周
	 */
	@ApiField("unit")
	private String unit;

	public Long getDeliveryFrequency() {
		return this.deliveryFrequency;
	}
	public void setDeliveryFrequency(Long deliveryFrequency) {
		this.deliveryFrequency = deliveryFrequency;
	}

	public Long getTotalDeliveryTimes() {
		return this.totalDeliveryTimes;
	}
	public void setTotalDeliveryTimes(Long totalDeliveryTimes) {
		this.totalDeliveryTimes = totalDeliveryTimes;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
