package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度限制模型
 *
 * @author auto create
 * @since 1.0, 2023-03-10 14:25:16
 */
public class QuotaLimitModelDTO extends AlipayObject {

	private static final long serialVersionUID = 8714878743396335929L;

	/**
	 * AMOUNT_LIMIT，金额限制
	 */
	@ApiField("type")
	private String type;

	/**
	 * lowerLimit（金额门槛）必填，upperLimit（金额上限）
如果无上限，upperLimit可不填
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
