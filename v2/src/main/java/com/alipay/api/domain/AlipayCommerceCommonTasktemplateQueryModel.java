package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务模板详情查询
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:31:08
 */
public class AlipayCommerceCommonTasktemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2351842439166791191L;

	/**
	 * 代运营商户id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

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

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
