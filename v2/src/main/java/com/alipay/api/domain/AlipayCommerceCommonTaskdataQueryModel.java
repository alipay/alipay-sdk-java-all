package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务数据查询
 *
 * @author auto create
 * @since 1.0, 2023-11-30 19:03:34
 */
public class AlipayCommerceCommonTaskdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5887889822138249696L;

	/**
	 * 代运营商户的id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 任务实例id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

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

	public String getTaskInstanceId() {
		return this.taskInstanceId;
	}
	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
