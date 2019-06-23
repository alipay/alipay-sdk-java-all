package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发验证openapi内部
 *
 * @author auto create
 * @since 1.0, 2019-04-16 14:57:45
 */
public class AlipaySecurityTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2831524965814758776L;

	/**
	 * 纬度1231
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
