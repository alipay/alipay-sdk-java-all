package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测详情
 *
 * @author auto create
 * @since 1.0, 2023-02-06 14:15:41
 */
public class CheckDetails extends AlipayObject {

	private static final long serialVersionUID = 6499774767912128641L;

	/**
	 * 替换旧SN的新SN
	 */
	@ApiField("new_value")
	private String newValue;

	/**
	 * SN
	 */
	@ApiField("value")
	private String value;

	public String getNewValue() {
		return this.newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
