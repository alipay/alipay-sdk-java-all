package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动属性可选项
 *
 * @author auto create
 * @since 1.0, 2023-09-06 13:43:49
 */
public class PromoActivityAttrOptionVO extends AlipayObject {

	private static final long serialVersionUID = 8623884998459429619L;

	/**
	 * 描述可选项的名称
	 */
	@ApiField("label")
	private String label;

	/**
	 * 可选项的值
	 */
	@ApiField("value")
	private String value;

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
