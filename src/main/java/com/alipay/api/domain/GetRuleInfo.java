package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放规则
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:24
 */
public class GetRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 5257182428312164942L;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 发放次数限制
	 */
	@ApiField("get_count_limit")
	private PeriodInfo getCountLimit;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public PeriodInfo getGetCountLimit() {
		return this.getCountLimit;
	}
	public void setGetCountLimit(PeriodInfo getCountLimit) {
		this.getCountLimit = getCountLimit;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
