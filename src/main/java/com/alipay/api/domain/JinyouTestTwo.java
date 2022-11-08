package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JinyouTestTwo
 *
 * @author auto create
 * @since 1.0, 2022-09-13 23:38:09
 */
public class JinyouTestTwo extends AlipayObject {

	private static final long serialVersionUID = 4583735367366226499L;

	/**
	 * 1
	 */
	@ApiField("t_1_openid")
	private String t1Openid;

	/**
	 * 1
	 */
	@ApiField("t_1_y")
	private String t1Y;

	/**
	 * 1
	 */
	@ApiField("t_2_f")
	private JinyouTestOne t2F;

	/**
	 * 1
	 */
	@ApiField("t_3_n")
	private String t3N;

	public String getT1Openid() {
		return this.t1Openid;
	}
	public void setT1Openid(String t1Openid) {
		this.t1Openid = t1Openid;
	}

	public String getT1Y() {
		return this.t1Y;
	}
	public void setT1Y(String t1Y) {
		this.t1Y = t1Y;
	}

	public JinyouTestOne getT2F() {
		return this.t2F;
	}
	public void setT2F(JinyouTestOne t2F) {
		this.t2F = t2F;
	}

	public String getT3N() {
		return this.t3N;
	}
	public void setT3N(String t3N) {
		this.t3N = t3N;
	}

}
