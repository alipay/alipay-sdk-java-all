package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动报名基本信息
 *
 * @author auto create
 * @since 1.0, 2023-03-26 14:08:02
 */
public class RecruitEnrollBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 7798772225735998145L;

	/**
	 * 报名时间。
系统处理创建报名调用的时间。
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 活动报名ID。
创建报名时返回的 enroll_id。
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/**
	 * 创建报名的目标活动方案ID。
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 活动报名状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 报名状态说明信息。
当审核不通过时（status = REJECTED），非空。
	 */
	@ApiField("status_description")
	private String statusDescription;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEnrollId() {
		return this.enrollId;
	}
	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDescription() {
		return this.statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

}
