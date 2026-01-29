package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-24 15:12:41
 */
public class EpBusinessIndicator extends AlipayObject {

	private static final long serialVersionUID = 7277982637175528652L;

	/**
	 * 指标码值
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 指标名称
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 指标数值
	 */
	@ApiField("label_value")
	private String labelValue;

	public String getLabelCode() {
		return this.labelCode;
	}
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

}
