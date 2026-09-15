package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 编辑外呼分派规则
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:10
 */
public class DatadigitalAicsDevinDistributeruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4619771439161593412L;

	/**
	 * 待更新字段键值，必填，仅传需变更字段；具体字段由表单定义（JSON字符串格式，例如 {"name":"策略A","status":"1"}）
	 */
	@ApiField("data")
	private String data;

	/**
	 * 表单编码，固定值 DING_CUE_DISTRIBUTE_RULE
	 */
	@ApiField("form_code")
	private String formCode;

	/**
	 * 待编辑分派规则ID
	 */
	@ApiField("id")
	private Long id;

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

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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
