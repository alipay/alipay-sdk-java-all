package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务商品咨询因子
 *
 * @author auto create
 * @since 1.0, 2021-05-14 11:32:20
 */
public class HealthServiceItemConsultFactor extends AlipayObject {

	private static final long serialVersionUID = 1431689633816899964L;

	/**
	 * 咨询因子Key
	 */
	@ApiField("factor_key")
	private String factorKey;

	/**
	 * 咨询因子值
	 */
	@ApiField("factor_value")
	private String factorValue;

	public String getFactorKey() {
		return this.factorKey;
	}
	public void setFactorKey(String factorKey) {
		this.factorKey = factorKey;
	}

	public String getFactorValue() {
		return this.factorValue;
	}
	public void setFactorValue(String factorValue) {
		this.factorValue = factorValue;
	}

}
