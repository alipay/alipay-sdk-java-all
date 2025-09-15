package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 字段属性
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:19:58
 */
public class PropertyOutDTO extends AlipayObject {

	private static final long serialVersionUID = 4225891563771884787L;

	/**
	 * 是否禁用
	 */
	@ApiField("disabled")
	private Boolean disabled;

	/**
	 * 是否必须
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 是否展示
	 */
	@ApiField("show")
	private Boolean show;

	public Boolean getDisabled() {
		return this.disabled;
	}
	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Boolean getShow() {
		return this.show;
	}
	public void setShow(Boolean show) {
		this.show = show;
	}

}
