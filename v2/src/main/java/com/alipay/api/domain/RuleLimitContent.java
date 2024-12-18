package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 限制规则内容
 *
 * @author auto create
 * @since 1.0, 2023-08-04 13:56:54
 */
public class RuleLimitContent extends AlipayObject {

	private static final long serialVersionUID = 3353556575293678129L;

	/**
	 * 门店编号类型
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 外部或内部门店编号
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
