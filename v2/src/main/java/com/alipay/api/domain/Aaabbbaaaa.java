package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ceshiceshi
 *
 * @author auto create
 * @since 1.0, 2023-08-28 11:40:23
 */
public class Aaabbbaaaa extends AlipayObject {

	private static final long serialVersionUID = 7291318177298561196L;

	/**
	 * ceshi
	 */
	@ApiField("aaaa")
	private AddressInfo aaaa;

	/**
	 * 2222
	 */
	@ApiField("bbbb")
	private String bbbb;

	public AddressInfo getAaaa() {
		return this.aaaa;
	}
	public void setAaaa(AddressInfo aaaa) {
		this.aaaa = aaaa;
	}

	public String getBbbb() {
		return this.bbbb;
	}
	public void setBbbb(String bbbb) {
		this.bbbb = bbbb;
	}

}
