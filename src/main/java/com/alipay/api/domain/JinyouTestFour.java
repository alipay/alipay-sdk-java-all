package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JinyouTestFour
 *
 * @author auto create
 * @since 1.0, 2022-09-13 23:43:00
 */
public class JinyouTestFour extends AlipayObject {

	private static final long serialVersionUID = 8566221134367371171L;

	/**
	 * 1
	 */
	@ApiField("f_1_openid")
	private String f1Openid;

	/**
	 * 1
	 */
	@ApiField("f_1_y")
	private String f1Y;

	/**
	 * 11
	 */
	@ApiField("f_2_f")
	private JinyouTestThree f2F;

	/**
	 * 1
	 */
	@ApiField("f_3_openid")
	private String f3Openid;

	/**
	 * 1
	 */
	@ApiField("f_3_y")
	private Long f3Y;

	public String getF1Openid() {
		return this.f1Openid;
	}
	public void setF1Openid(String f1Openid) {
		this.f1Openid = f1Openid;
	}

	public String getF1Y() {
		return this.f1Y;
	}
	public void setF1Y(String f1Y) {
		this.f1Y = f1Y;
	}

	public JinyouTestThree getF2F() {
		return this.f2F;
	}
	public void setF2F(JinyouTestThree f2F) {
		this.f2F = f2F;
	}

	public String getF3Openid() {
		return this.f3Openid;
	}
	public void setF3Openid(String f3Openid) {
		this.f3Openid = f3Openid;
	}

	public Long getF3Y() {
		return this.f3Y;
	}
	public void setF3Y(Long f3Y) {
		this.f3Y = f3Y;
	}

}
