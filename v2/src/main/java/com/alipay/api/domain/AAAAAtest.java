package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 1
 *
 * @author auto create
 * @since 1.0, 2024-01-29 14:10:00
 */
public class AAAAAtest extends AlipayObject {

	private static final long serialVersionUID = 8456458779549821725L;

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
	 * 11
	 */
	@ApiField("b")
	private String b;

	/**
	 * 11
	 */
	@ApiField("b_openid")
	private String bOpenid;

	/**
	 * 1
	 */
	@ApiField("e")
	private String e;

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

	public String getE() {
		return this.e;
	}
	public void setE(String e) {
		this.e = e;
	}

}
