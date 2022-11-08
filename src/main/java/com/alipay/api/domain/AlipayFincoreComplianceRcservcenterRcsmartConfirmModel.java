package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合规服务解语花工单维度打标反馈
 *
 * @author auto create
 * @since 1.0, 2022-08-26 11:07:22
 */
public class AlipayFincoreComplianceRcservcenterRcsmartConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6798889816573882536L;

	/**
	 * 调用方系统信息
	 */
	@ApiField("app_info")
	private RcsmartCommonAppInfo appInfo;

	/**
	 * 工单维度机审结果
	 */
	@ApiField("task_robot_audit_feedback_req")
	private TaskRobotAuditFeedbackReq taskRobotAuditFeedbackReq;

	public RcsmartCommonAppInfo getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(RcsmartCommonAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public TaskRobotAuditFeedbackReq getTaskRobotAuditFeedbackReq() {
		return this.taskRobotAuditFeedbackReq;
	}
	public void setTaskRobotAuditFeedbackReq(TaskRobotAuditFeedbackReq taskRobotAuditFeedbackReq) {
		this.taskRobotAuditFeedbackReq = taskRobotAuditFeedbackReq;
	}

}
