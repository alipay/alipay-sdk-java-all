package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 决策扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-10-31 20:52:11
 */
public class DecisionExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8291937227923557586L;

	/**
	 * 省份编码，由入参传入后拼接到结果数据中
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
