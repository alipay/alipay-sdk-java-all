package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取chy测试
 *
 * @author auto create
 * @since 1.0, 2022-01-29 11:22:08
 */
public class AlipaySecurityProdMyGetchyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3266243262339194186L;

	/**
	 * chen
	 */
	@ApiField("chen")
	private String chen;

	public String getChen() {
		return this.chen;
	}
	public void setChen(String chen) {
		this.chen = chen;
	}

}
