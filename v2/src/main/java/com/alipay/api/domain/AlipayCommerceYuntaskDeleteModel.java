package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除任务
 *
 * @author auto create
 * @since 1.0, 2022-11-16 19:33:14
 */
public class AlipayCommerceYuntaskDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3538472459262733141L;

	/**
	 * 商户pid， 代运营模式需要
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作者uid
	 */
	@ApiField("operate_open_id")
	private String operateOpenId;

	/**
	 * 操作者uid
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 任务模版id
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
