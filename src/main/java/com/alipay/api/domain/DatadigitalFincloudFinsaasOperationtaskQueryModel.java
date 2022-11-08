package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营任务精确查询
 *
 * @author auto create
 * @since 1.0, 2022-04-27 16:48:48
 */
public class DatadigitalFincloudFinsaasOperationtaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5238178722173773343L;

	/**
	 * operation_task_id + 唯一 + 运营任务查询 + 批量查询接口会返回该值。
	 */
	@ApiField("operation_task_id")
	private String operationTaskId;

	/**
	 * tenant_code + 唯一 + 接口必传 + 从 IAM 获取
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getOperationTaskId() {
		return this.operationTaskId;
	}
	public void setOperationTaskId(String operationTaskId) {
		this.operationTaskId = operationTaskId;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
