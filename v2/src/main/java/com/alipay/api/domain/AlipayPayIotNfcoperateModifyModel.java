package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC货柜海报活动编辑
 *
 * @author auto create
 * @since 1.0, 2025-03-25 21:01:55
 */
public class AlipayPayIotNfcoperateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5534144146913159293L;

	/**
	 * 活动投放结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 表示计划是否下线
	 */
	@ApiField("offline")
	private Boolean offline;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 用于编辑的计划信息
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 活动投放开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getOffline() {
		return this.offline;
	}
	public void setOffline(Boolean offline) {
		this.offline = offline;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
