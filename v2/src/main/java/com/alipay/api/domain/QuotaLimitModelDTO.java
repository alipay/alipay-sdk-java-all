package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度限制模型
 *
 * @author auto create
 * @since 1.0, 2023-02-20 14:04:22
 */
public class QuotaLimitModelDTO extends AlipayObject {

	private static final long serialVersionUID = 6574282967953595496L;

	/**
	 * AMOUNT_LIMIT，金额限制
	 */
	@ApiField("type")
	private String type;

	/**
	 * 当type=AMOUNT_LIMIT时，传入格式[100,+∞)
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
