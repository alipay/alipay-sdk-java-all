package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务终止
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:32:59
 */
public class AlipayCommerceCommonTasktemplateStopModel extends AlipayObject {

	private static final long serialVersionUID = 3812265788812375337L;

	/**
	 * 代运营商户id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作者openId
	 */
	@ApiField("operate_open_id")
	private String operateOpenId;

	/**
	 * 操作者id
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 任务模板id
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
