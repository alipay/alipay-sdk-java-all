package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenAPI脱敏配置测试
 *
 * @author auto create
 * @since 1.0, 2022-01-08 21:14:54
 */
public class AlipaySecurityProdHahaTestdddQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2877973194352863145L;

	/**
	 * 32
	 */
	@ApiField("haha")
	private String haha;

	public String getHaha() {
		return this.haha;
	}
	public void setHaha(String haha) {
		this.haha = haha;
	}

}
