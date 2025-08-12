package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海关测试验收--有用户授权有打标
 *
 * @author auto create
 * @since 1.0, 2022-02-09 11:31:50
 */
public class AlipaySecurityProdHaiguanAuthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1787578695441356412L;

	/**
	 * 12
	 */
	@ApiField("one")
	private String one;

	public String getOne() {
		return this.one;
	}
	public void setOne(String one) {
		this.one = one;
	}

}
