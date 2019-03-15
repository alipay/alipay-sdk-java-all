package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发新老版本对齐测试
 *
 * @author auto create
 * @since 1.0, 2019-01-16 20:06:54
 */
public class AlipaySecurityProdAaBbQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2686559124962552323L;

	/**
	 * 金额
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
