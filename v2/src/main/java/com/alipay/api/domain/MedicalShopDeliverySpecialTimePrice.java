package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业电子围栏特殊时段加价规则
 *
 * @author auto create
 * @since 1.0, 2024-06-12 16:00:06
 */
public class MedicalShopDeliverySpecialTimePrice extends AlipayObject {

	private static final long serialVersionUID = 5382764339978867895L;

	/**
	 * 时间段结束时间，结束时间必须大于起始时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 价格，单位：分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 时间段起始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
