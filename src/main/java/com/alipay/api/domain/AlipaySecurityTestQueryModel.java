package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发验证openapi内部
 *
 * @author auto create
 * @since 1.0, 2019-02-18 10:37:04
 */
public class AlipaySecurityTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5721593382692955665L;

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
