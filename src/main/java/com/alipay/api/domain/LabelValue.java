package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * keyvalue对
 *
 * @author auto create
 * @since 1.0, 2022-06-01 09:42:27
 */
public class LabelValue extends AlipayObject {

	private static final long serialVersionUID = 7174315123185689379L;

	/**
	 * keyvalue对的key
	 */
	@ApiField("label")
	private String label;

	/**
	 * keyvalue对的value值
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
