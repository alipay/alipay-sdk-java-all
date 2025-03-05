package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超导白名单创建
 *
 * @author auto create
 * @since 1.0, 2024-08-08 16:34:45
 */
public class AlipayCommerceYuntaskWhiteuserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7895643712256639629L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作人open id
	 */
	@ApiField("operate_open_id")
	private String operateOpenId;

	/**
	 * 操作人id
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 超导任务模版id，在超导SaaS后台针对任务点击操作时，将对应的任务id传过来
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	/**
	 * 白名单手机号
	 */
	@ApiField("white_phone")
	private String whitePhone;

	/**
	 * 白名单类型，详见枚举值，默认为店员
	 */
	@ApiField("white_type")
	private String whiteType;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperateOpenId() {
		return this.operateOpenId;
	}
	public void setOperateOpenId(String operateOpenId) {
		this.operateOpenId = operateOpenId;
	}

	public String getOperateUserId() {
		return this.operateUserId;
	}
	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

	public String getWhitePhone() {
		return this.whitePhone;
	}
	public void setWhitePhone(String whitePhone) {
		this.whitePhone = whitePhone;
	}

	public String getWhiteType() {
		return this.whiteType;
	}
	public void setWhiteType(String whiteType) {
		this.whiteType = whiteType;
	}

}
