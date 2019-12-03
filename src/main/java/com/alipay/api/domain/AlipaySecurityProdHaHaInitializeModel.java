package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 哈哈
 *
 * @author auto create
 * @since 1.0, 2019-11-29 17:57:40
 */
public class AlipaySecurityProdHaHaInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7198451369345278173L;

	/**
	 * 区
	 */
	@ApiField("area_code")
	private String areaCode;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

}
