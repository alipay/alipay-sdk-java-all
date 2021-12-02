package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 领取广场舞大赛任务
 *
 * @author auto create
 * @since 1.0, 2019-10-18 17:30:26
 */
public class AlipayUserMemberTakegcwtaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8622857814472148111L;

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
