package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资方确认任务
 *
 * @author auto create
 * @since 1.0, 2022-03-24 09:49:05
 */
public class AlipayCommerceYuntaskConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4488616163984773679L;

	/**
	 * 出资方id
	 */
	@ApiField("funder_id")
	private String funderId;

	/**
	 * 出资方类型，品牌方:BRAND
	 */
	@ApiField("funder_type")
	private String funderType;

	/**
	 * 操作者uid
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 零售商pid，任务所有者
	 */
	@ApiField("owner_pid")
	private String ownerPid;

	/**
	 * 任务模版id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public String getFunderId() {
		return this.funderId;
	}
	public void setFunderId(String funderId) {
		this.funderId = funderId;
	}

	public String getFunderType() {
		return this.funderType;
	}
	public void setFunderType(String funderType) {
		this.funderType = funderType;
	}

	public String getOperateUserId() {
		return this.operateUserId;
	}
	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
	}

	public String getOwnerPid() {
		return this.ownerPid;
	}
	public void setOwnerPid(String ownerPid) {
		this.ownerPid = ownerPid;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
