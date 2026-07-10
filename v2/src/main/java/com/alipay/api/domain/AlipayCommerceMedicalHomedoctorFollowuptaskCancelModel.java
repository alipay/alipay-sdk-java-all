package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消随访任务
 *
 * @author auto create
 * @since 1.0, 2026-06-24 18:02:58
 */
public class AlipayCommerceMedicalHomedoctorFollowuptaskCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8216999796723183331L;

	/**
	 * 阿福用户openid
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/**
	 * 外部业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 随访任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
