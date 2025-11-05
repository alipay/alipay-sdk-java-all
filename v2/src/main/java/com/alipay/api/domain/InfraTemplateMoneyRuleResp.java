package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金额元素限制对象
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:59
 */
public class InfraTemplateMoneyRuleResp extends AlipayObject {

	private static final long serialVersionUID = 5217594612213372325L;

	/**
	 * 金额精度，即小数点后保留几位小数
	 */
	@ApiField("decimal")
	private Long decimal;

	public Long getDecimal() {
		return this.decimal;
	}
	public void setDecimal(Long decimal) {
		this.decimal = decimal;
	}

}
