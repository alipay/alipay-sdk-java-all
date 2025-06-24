package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询因子，用于查询机构，获取服务资源项数据，用于接口入参。
举例：入参是省市区，用来获取可用服务门店；入参是机构门店ID，查询门店可预约日期等。
 *
 * @author auto create
 * @since 1.0, 2024-09-25 16:05:54
 */
public class ServiceConsultFactor extends AlipayObject {

	private static final long serialVersionUID = 3313184941641166858L;

	/**
	 * 咨询因子key，作为入参，用来查询机构。
	 */
	@ApiField("factor_key")
	private String factorKey;

	/**
	 * 咨询因子的值，此值提供给机构获取服务履约的可选信息，不会涉及用户信息。
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
