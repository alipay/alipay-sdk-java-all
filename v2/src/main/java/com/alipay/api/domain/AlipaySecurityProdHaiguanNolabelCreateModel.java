package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海关测试验收--有用户授权无打标
 *
 * @author auto create
 * @since 1.0, 2024-07-31 18:09:03
 */
public class AlipaySecurityProdHaiguanNolabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6466121868523275118L;

	/**
	 * 23
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
