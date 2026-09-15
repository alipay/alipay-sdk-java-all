package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除外呼任务
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:08
 */
public class DatadigitalAicsDevinTaskDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4829595572112842738L;

	/**
	 * 任务code
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
