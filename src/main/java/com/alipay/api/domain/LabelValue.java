package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * keyvalue对
 *
 * @author auto create
 * @since 1.0, 2022-05-24 20:14:50
 */
public class LabelValue extends AlipayObject {

	private static final long serialVersionUID = 3261269683861714359L;

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
