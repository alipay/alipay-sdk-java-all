package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗健康门店时间段
 *
 * @author auto create
 * @since 1.0, 2024-05-09 14:35:28
 */
public class MedicalShopTimePeriod extends AlipayObject {

	private static final long serialVersionUID = 8562644981295293968L;

	/**
	 * 时间段结束时间。
结束时间必须大于起始时间
	 */
	@ApiField("end_time")
	private String endTime;

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

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
