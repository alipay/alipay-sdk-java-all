package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 比例分佣条款
 *
 * @author auto create
 * @since 1.0, 2017-03-02 11:28:27
 */
public class KbAdvertPercentageCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 8525797117415163387L;

	/**
	 * 分佣封顶金额
	 */
	@ApiField("max")
	private String max;

	/**
	 * 分佣比例(100以内精度2位的非负小数)
例如30.04%，则输入  30.04
分佣比例存在浮动的下限，可通过业务文档获取实际值
	 */
	@ApiField("rate")
	private String rate;

	public String getMax() {
		return this.max;
	}
	public void setMax(String max) {
		this.max = max;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

}
