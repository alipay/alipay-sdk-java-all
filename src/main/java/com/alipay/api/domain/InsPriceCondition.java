package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保费价格条件表达式
 *
 * @author auto create
 * @since 1.0, 2016-11-09 17:21:30
 */
public class InsPriceCondition extends AlipayObject {

	private static final long serialVersionUID = 4136723116888483232L;

	/**
	 * 价格因子;period:保障期限,sum_insured:保额
	 */
	@ApiField("factor")
	private String factor;

	/**
	 * 价格因子对应的值
	 */
	@ApiField("value")
	private String value;

	public String getFactor() {
		return this.factor;
	}
	public void setFactor(String factor) {
		this.factor = factor;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
