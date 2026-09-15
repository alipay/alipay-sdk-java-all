package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 策略编辑
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:14
 */
public class DatadigitalAicsDevinStrategyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1215973867474827911L;

	/**
	 * String字符串传递Map。待更新字段键值数据，必填，支持部分更新；改可见性可仅传{"show_status":"..."}，具体字段由表单定义动态决定
	 */
	@ApiField("data")
	private String data;

	/**
	 * 表单编码，固定值 WORK（处理器校验必须为 WORK）
	 */
	@ApiField("form_code")
	private String formCode;

	/**
	 * 待编辑数据ID，必填，需大于0
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 是否脱敏，默认false
	 */
	@ApiField("need_mask_field")
	private Boolean needMaskField;

	/**
	 * 租户ID，长度8-32位
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
