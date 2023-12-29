package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预点餐设置中，单个自提时段模型
 *
 * @author auto create
 * @since 1.0, 2020-08-06 17:08:33
 */
public class TimePeriod extends AlipayObject {

	private static final long serialVersionUID = 5555695754745787879L;

	/**
	 * 自提时段开始时间，如05:00
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 自提时段结束时间，如23:30
	 */
	@ApiField("end_time")
	private String endTime;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
