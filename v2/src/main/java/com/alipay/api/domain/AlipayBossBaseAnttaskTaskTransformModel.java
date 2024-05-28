package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转交任务
 *
 * @author auto create
 * @since 1.0, 2023-09-18 22:07:34
 */
public class AlipayBossBaseAnttaskTaskTransformModel extends AlipayObject {

	private static final long serialVersionUID = 8776633525425366341L;

	/**
	 * 接入时的systemType
	 */
	@ApiField("auth_key")
	private String authKey;

	/**
	 * 接入系统信息，包括system_type和source_id
	 */
	@ApiField("business_id")
	private BusinessId businessId;

	/**
	 * 时间戳，到期时间
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * 签名信息，不在此展示
	 */
	@ApiField("signature")
	private String signature;

	/**
	 * 任务Id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 转交人工号，需要6位工号，不足6位需要补0
	 */
	@ApiField("work_no")
	private String workNo;

	public String getAuthKey() {
		return this.authKey;
	}
	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public BusinessId getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(BusinessId businessId) {
		this.businessId = businessId;
	}

	public String getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
