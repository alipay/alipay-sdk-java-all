package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-20 14:42:55
 */
public class SalesforceCouponInstanceResponse extends AlipayObject {

	private static final long serialVersionUID = 2417376157567478778L;

	/**
	 * BOSS返回的可选扩展属性映射，可为空；不作为实例选择标识
	 */
	@ApiField("attributes")
	private SalesforceCouponInstanceAttributes attributes;

	/**
	 * 实例显示文本，当前BOSS实现与实例ID一致
	 */
	@ApiField("label")
	private String label;

	/**
	 * 候选实例ID，提交申请时使用
	 */
	@ApiField("value")
	private String value;

	public SalesforceCouponInstanceAttributes getAttributes() {
		return this.attributes;
	}
	public void setAttributes(SalesforceCouponInstanceAttributes attributes) {
		this.attributes = attributes;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
