package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JinyouTestFive
 *
 * @author auto create
 * @since 1.0, 2022-09-13 23:46:08
 */
public class JinyouTestFive extends AlipayObject {

	private static final long serialVersionUID = 4149388589932182784L;

	/**
	 * 11
	 */
	@ApiField("f_1_f")
	private JinyouTestFour f1F;

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
	private String f3Y;

	/**
	 * 3
	 */
	@ApiField("f_4_n")
	private String f4N;

	public JinyouTestFour getF1F() {
		return this.f1F;
	}
	public void setF1F(JinyouTestFour f1F) {
		this.f1F = f1F;
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

	public String getF3Y() {
		return this.f3Y;
	}
	public void setF3Y(String f3Y) {
		this.f3Y = f3Y;
	}

	public String getF4N() {
		return this.f4N;
	}
	public void setF4N(String f4N) {
		this.f4N = f4N;
	}

}
