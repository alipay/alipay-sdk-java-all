package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建外呼分派规则
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:13
 */
public class DatadigitalAicsDevinDistributeruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6881686999634749542L;

	/**
	 * 分派规则字段键值，必填；含 rule_name/rule_status/execution_type/condition_type/distribute_type/distribute_detail 等，具体字段由表单定义（JSON字符串格式，例如 {"name":"策略A","status":"1"}）
	 */
	@ApiField("data")
	private String data;

	/**
	 * 表单编码，固定值 DING_CUE_DISTRIBUTE_RULE
	 */
	@ApiField("form_code")
	private String formCode;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getFormCode() {
		return this.formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
