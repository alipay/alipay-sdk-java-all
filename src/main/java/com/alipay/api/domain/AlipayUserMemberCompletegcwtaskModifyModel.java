package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广场舞大赛活动任务推进
 *
 * @author auto create
 * @since 1.0, 2019-10-18 17:30:34
 */
public class AlipayUserMemberCompletegcwtaskModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7369698783196766225L;

	/**
	 * 蚂蚁统一会员ID，16位2088开头。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 应用id，固定值，用于识别相关调用方的应用来源
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 任务完成的时间戳，通过new Date()获取任务完成的当前时间即可
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 任务的业务类型，与任务列表的biz_type业务类型保持一致
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务类型的结果值，按约定结果返回，比如Y
	 */
	@ApiField("biz_value")
	private String bizValue;

	/**
	 * 任务流水id，唯一值，用于双方幂等控制
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizValue() {
		return this.bizValue;
	}
	public void setBizValue(String bizValue) {
		this.bizValue = bizValue;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
