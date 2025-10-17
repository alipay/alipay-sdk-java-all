package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-10 13:57:40
 */
public class FuelItemLabelCreateInfo extends AlipayObject {

	private static final long serialVersionUID = 5895927658285773955L;

	/**
	 * 标签key
	 */
	@ApiField("label_key")
	private String labelKey;

	/**
	 * 标签值
	 */
	@ApiField("label_value")
	private String labelValue;

	public String getLabelKey() {
		return this.labelKey;
	}
	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

}
