package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超导白名单验证完提审
 *
 * @author auto create
 * @since 1.0, 2024-08-08 16:34:49
 */
public class AlipayCommerceYuntaskTestpassTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 6888437487626856151L;

	/**
	 * 商户pid， 代运营模式需要，超导后台操作任务对应的商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作者id
	 */
	@ApiField("operate_open_id")
	private String operateOpenId;

	/**
	 * 操作者id
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 超导任务模版id，在超导SaaS后台针对任务点击操作时，将对应的任务id传过来
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
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

}
