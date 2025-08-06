package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云配置智能体基本信息
 *
 * @author auto create
 * @since 1.0, 2025-07-17 10:21:02
 */
public class GetAgentResult extends AlipayObject {

	private static final long serialVersionUID = 4513592871463945364L;

	/**
	 * 智能体信息
	 */
	@ApiField("doctor")
	private Doctor doctor;

	/**
	 * 0.缺少信息
1.与灵知数据库重名
2.医院未开通服务
3.科室未标准化
4.医生未开通智能体
5.匹配成功（已开通医生智能体）
6.匹配多个
	 */
	@ApiField("operation_status")
	private String operationStatus;

	/**
	 * 0.缺少信息
1.与灵知数据库重名
2.医院未开通服务
3.科室未标准化
4.医生未开通智能体
5.匹配成功
6.匹配多个
	 */
	@ApiField("operation_status_description")
	private String operationStatusDescription;

	public Doctor getDoctor() {
		return this.doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getOperationStatus() {
		return this.operationStatus;
	}
	public void setOperationStatus(String operationStatus) {
		this.operationStatus = operationStatus;
	}

	public String getOperationStatusDescription() {
		return this.operationStatusDescription;
	}
	public void setOperationStatusDescription(String operationStatusDescription) {
		this.operationStatusDescription = operationStatusDescription;
	}

}
