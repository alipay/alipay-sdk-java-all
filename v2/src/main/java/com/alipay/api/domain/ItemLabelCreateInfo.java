package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品标签添加信息
 *
 * @author auto create
 * @since 1.0, 2018-11-28 00:07:53
 */
public class ItemLabelCreateInfo extends AlipayObject {

	private static final long serialVersionUID = 1438766665323679878L;

	/**
	 * 标签键
OIL_NUM：油号
	 */
	@ApiField("label_key")
	private String labelKey;

	/**
	 * 标签值：
OIL_NUM对应的值为：95# 92# 98# 等等
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
