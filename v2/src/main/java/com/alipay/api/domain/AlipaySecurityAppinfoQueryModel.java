package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 我是是是会
 *
 * @author auto create
 * @since 1.0, 2023-04-21 16:53:15
 */
public class AlipaySecurityAppinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5493257627145992447L;

	/**
	 * 1
	 */
	@ApiField("aaa")
	private String aaa;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

}
