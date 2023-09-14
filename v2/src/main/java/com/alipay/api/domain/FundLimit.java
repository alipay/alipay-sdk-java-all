package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资限制模型
 *
 * @author auto create
 * @since 1.0, 2023-03-07 12:03:36
 */
public class FundLimit extends AlipayObject {

	private static final long serialVersionUID = 1827214356554846788L;

	/**
	 * 限制类型
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 限制商圈id，以”,“分隔
	 */
	@ApiField("limit_value")
	private String limitValue;

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public String getLimitValue() {
		return this.limitValue;
	}
	public void setLimitValue(String limitValue) {
		this.limitValue = limitValue;
	}

}
