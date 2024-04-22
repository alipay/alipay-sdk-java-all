package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组合id集合
 *
 * @author auto create
 * @since 1.0, 2023-09-15 10:27:14
 */
public class ComponentId extends AlipayObject {

	private static final long serialVersionUID = 2157334467424241449L;

	/**
	 * 接入系统信息，包括system_type和source_id
	 */
	@ApiField("business_id")
	private BusinessId businessId;

	/**
	 * 接入任务中心时，填写的source_id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * system_type
	 */
	@ApiField("system_type")
	private String systemType;

	/**
	 * 任务Id
	 */
	@ApiField("task_id")
	private String taskId;

	public BusinessId getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(BusinessId businessId) {
		this.businessId = businessId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSystemType() {
		return this.systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
