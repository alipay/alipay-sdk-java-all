package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品标签
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:43
 */
public class ExternalItemLabel extends AlipayObject {

	private static final long serialVersionUID = 6764285385456965551L;

	/**
	 * 标签ID
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签值
	 */
	@ApiField("label_value")
	private String labelValue;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

}
