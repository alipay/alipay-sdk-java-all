package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * cechsi
 *
 * @author auto create
 * @since 1.0, 2023-01-30 19:08:30
 */
public class AlipayOpenAppOpenbizmockMsgSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8835882879949275575L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("a_openid")
	private String aOpenid;

	/**
	 * ceshi
	 */
	@ApiField("b")
	private String b;

	/**
	 * ceshi
	 */
	@ApiField("b_openid")
	private String bOpenid;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getaOpenid() {
		return this.aOpenid;
	}
	public void setaOpenid(String aOpenid) {
		this.aOpenid = aOpenid;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getbOpenid() {
		return this.bOpenid;
	}
	public void setbOpenid(String bOpenid) {
		this.bOpenid = bOpenid;
	}

}
