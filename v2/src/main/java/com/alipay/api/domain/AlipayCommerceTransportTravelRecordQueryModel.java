package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户乘车行为
 *
 * @author auto create
 * @since 1.0, 2024-05-08 17:37:59
 */
public class AlipayCommerceTransportTravelRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3876933573911541511L;

	/**
	 * 结束时间，精确到秒，小于结束时间（不包含结束时间）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 起始时间，精确到秒，大于等于起始时间（包含起始时间）
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
