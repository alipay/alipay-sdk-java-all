package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询任务详情
 *
 * @author auto create
 * @since 1.0, 2022-03-24 09:48:55
 */
public class AlipayCommerceYuntaskDetailGetModel extends AlipayObject {

	private static final long serialVersionUID = 2199359213224781822L;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

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

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
