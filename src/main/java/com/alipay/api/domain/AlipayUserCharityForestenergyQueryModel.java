package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户时间段能量账单
 *
 * @author auto create
 * @since 1.0, 2017-08-09 19:32:54
 */
public class AlipayUserCharityForestenergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4192597589796536255L;

	/**
	 * 查询收取能量的结束日期。格式：yyyy-MM-dd HH:mm:ss。时间区间不得大于3天。
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 查询收取能量的开始日期。格式：yyyy-MM-dd HH:mm:ss
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
