package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海关测试验收--有用户授权无打标
 *
 * @author auto create
 * @since 1.0, 2022-02-09 11:30:24
 */
public class AlipaySecurityProdHaiguanNolabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4858572849135284329L;

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
