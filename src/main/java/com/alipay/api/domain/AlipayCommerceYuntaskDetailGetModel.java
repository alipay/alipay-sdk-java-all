package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询任务详情
 *
 * @author auto create
 * @since 1.0, 2022-07-13 13:27:12
 */
public class AlipayCommerceYuntaskDetailGetModel extends AlipayObject {

	private static final long serialVersionUID = 3286459282773852453L;

	/**
	 * 出资方pid，出资方模式下必传merchant_pid
	 */
	@ApiField("funder_id")
	private String funderId;

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

	public String getFunderId() {
		return this.funderId;
	}
	public void setFunderId(String funderId) {
		this.funderId = funderId;
	}

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
