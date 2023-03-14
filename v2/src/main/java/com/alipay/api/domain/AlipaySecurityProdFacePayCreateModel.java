package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * facepay
 *
 * @author auto create
 * @since 1.0, 2021-02-23 14:29:11
 */
public class AlipaySecurityProdFacePayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7413953737333636634L;

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

	/**
	 * 1
	 */
	@ApiField("bbbbb")
	private String bbbbb;

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

	public String getBbbbb() {
		return this.bbbbb;
	}
	public void setBbbbb(String bbbbb) {
		this.bbbbb = bbbbb;
	}

}
