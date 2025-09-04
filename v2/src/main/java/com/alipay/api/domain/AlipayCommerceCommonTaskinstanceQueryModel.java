package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务实例详情查询
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:31:35
 */
public class AlipayCommerceCommonTaskinstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5797988428237491573L;

	/**
	 * 导购的userId
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购的openId
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 代运营商户id
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

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
	}

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
