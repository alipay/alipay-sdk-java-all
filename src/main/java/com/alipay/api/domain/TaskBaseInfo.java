package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销任务基本信息
 *
 * @author auto create
 * @since 1.0, 2022-06-29 17:53:46
 */
public class TaskBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 7375114837913815181L;

	/**
	 * 开始时间
	 */
	@ApiField("gmt_begin")
	private Date gmtBegin;

	/**
	 * 结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 报名起始时间
	 */
	@ApiField("sign_up_begin_time")
	private Date signUpBeginTime;

	/**
	 * 报名结束时间
	 */
	@ApiField("sign_up_end_time")
	private Date signUpEndTime;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	public Date getGmtBegin() {
		return this.gmtBegin;
	}
	public void setGmtBegin(Date gmtBegin) {
		this.gmtBegin = gmtBegin;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getSignUpBeginTime() {
		return this.signUpBeginTime;
	}
	public void setSignUpBeginTime(Date signUpBeginTime) {
		this.signUpBeginTime = signUpBeginTime;
	}

	public Date getSignUpEndTime() {
		return this.signUpEndTime;
	}
	public void setSignUpEndTime(Date signUpEndTime) {
		this.signUpEndTime = signUpEndTime;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
