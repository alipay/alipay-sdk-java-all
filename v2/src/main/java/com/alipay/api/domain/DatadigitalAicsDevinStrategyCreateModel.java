package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建策略
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:13
 */
public class DatadigitalAicsDevinStrategyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2135624842667648162L;

	/**
	 * 策略字段键值数据，必填。key 见 WorkFiledEnum；下方 properties 为枚举字段及其全部取值，其余动态字段(name/priority/status/assigner/related_task_code/start_time/end_time/cue_count/complete_count/related_picked_id/cue_list/related_user 等)由表单定义、以 additionalProperties 任意键值透传。（JSON字符串格式，例如 {"name":"策略A","status":"1"}）
	 */
	@ApiField("data")
	private String data;

	/**
	 * 表单编码，固定值 WORK
	 */
	@ApiField("form_code")
	private String formCode;

	/**
	 * 是否脱敏，默认false
	 */
	@ApiField("need_mask_field")
	private Boolean needMaskField;

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

	public Boolean getNeedMaskField() {
		return this.needMaskField;
	}
	public void setNeedMaskField(Boolean needMaskField) {
		this.needMaskField = needMaskField;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
