package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * facepay
 *
 * @author auto create
 * @since 1.0, 2020-07-03 14:15:10
 */
public class AlipaySecurityProdFacePayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4832834128481922384L;

	/**
	 * 1
	 */
	@ApiField("aaa")
	private String aaa;

	/**
	 * 2
	 */
	@ApiField("aaaaaaaaaaaaa")
	private String aaaaaaaaaaaaa;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public String getAaaaaaaaaaaaa() {
		return this.aaaaaaaaaaaaa;
	}
	public void setAaaaaaaaaaaaa(String aaaaaaaaaaaaa) {
		this.aaaaaaaaaaaaa = aaaaaaaaaaaaa;
	}

}
