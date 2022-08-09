package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试测试支付宝
 *
 * @author auto create
 * @since 1.0, 2022-07-20 14:43:16
 */
public class DatadigitalAnttechQqqCccQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4632137752636971861L;

	/**
	 * 省份
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * dgbhr
	 */
	@ApiField("re")
	private String re;

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRe() {
		return this.re;
	}
	public void setRe(String re) {
		this.re = re;
	}

}
