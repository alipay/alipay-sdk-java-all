package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部转开放验证
 *
 * @author auto create
 * @since 1.0, 2021-08-18 15:41:14
 */
public class AlipaySecurityDataInnerouterTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5492477548818995963L;

	/**
	 * 32
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
