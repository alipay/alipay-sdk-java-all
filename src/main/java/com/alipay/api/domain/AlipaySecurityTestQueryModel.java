package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发验证openapi内部
 *
 * @author auto create
 * @since 1.0, 2019-02-21 14:07:28
 */
public class AlipaySecurityTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7891798443768227244L;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
