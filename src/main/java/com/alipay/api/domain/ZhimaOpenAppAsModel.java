package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * as
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:13
 */
public class ZhimaOpenAppAsModel extends AlipayObject {

	private static final long serialVersionUID = 2695611134948614278L;

	/**
	 * zxc
	 */
	@ApiField("aaa")
	private AAATest aaa;

	/**
	 * ccc
	 */
	@ApiField("cccc")
	private AccountRecord cccc;

	public AAATest getAaa() {
		return this.aaa;
	}
	public void setAaa(AAATest aaa) {
		this.aaa = aaa;
	}

	public AccountRecord getCccc() {
		return this.cccc;
	}
	public void setCccc(AccountRecord cccc) {
		this.cccc = cccc;
	}

}
