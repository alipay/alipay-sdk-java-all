package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * API中心-新增复杂类型-
 *
 * @author auto create
 * @since 1.0, 2025-08-20 10:52:41
 */
public class RainyComplexTypeTheEleven extends AlipayObject {

	private static final long serialVersionUID = 8813312631362117869L;

	/**
	 * Hu昂天
	 */
	@ApiField("tc_01")
	private String tc01;

	public String getTc01() {
		return this.tc01;
	}
	public void setTc01(String tc01) {
		this.tc01 = tc01;
	}

}
