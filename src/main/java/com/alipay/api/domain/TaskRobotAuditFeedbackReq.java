package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工单维度打标反馈请求参数
 *
 * @author auto create
 * @since 1.0, 2022-08-22 14:18:35
 */
public class TaskRobotAuditFeedbackReq extends AlipayObject {

	private static final long serialVersionUID = 4541687178592457385L;

	/**
	 * 打标信息
	 */
	@ApiField("audit_result")
	private String auditResult;

	/**
	 * 工单维度机审结果反馈 机审结果是否正确true/false
	 */
	@ApiField("audit_status")
	private Boolean auditStatus;

	/**
	 * 请求Id，与app_name组成唯一健，保证业务请求幂等性，同时在请求完毕后，获取业务风险详情信息结果使用
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAuditResult() {
		return this.auditResult;
	}
	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public Boolean getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(Boolean auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
