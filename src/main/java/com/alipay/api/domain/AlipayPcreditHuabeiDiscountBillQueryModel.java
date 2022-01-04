package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗贴息活动账单查询
 *
 * @author auto create
 * @since 1.0, 2019-12-18 10:19:59
 */
public class AlipayPcreditHuabeiDiscountBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8152316393465769359L;

	/**
	 * 账单创建结束时间，与开始时间相距不能超过一个月
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * solution_id，贴息方案实例id
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 账单创建起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
