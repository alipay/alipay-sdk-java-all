package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金柚测试openapi
 *
 * @author auto create
 * @since 1.0, 2022-09-14 12:42:38
 */
public class AlipayPayAppXuanyitestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8229379167253752575L;

	/**
	 * 1
	 */
	@ApiField("o_1_openid")
	private String o1Openid;

	/**
	 * 1
	 */
	@ApiField("o_1_y")
	private String o1Y;

	/**
	 * 1
	 */
	@ApiField("o_2_n")
	private String o2N;

	/**
	 * 11
	 */
	@ApiField("o_3_f")
	private JinyouTestFive o3F;

	public String getO1Openid() {
		return this.o1Openid;
	}
	public void setO1Openid(String o1Openid) {
		this.o1Openid = o1Openid;
	}

	public String getO1Y() {
		return this.o1Y;
	}
	public void setO1Y(String o1Y) {
		this.o1Y = o1Y;
	}

	public String getO2N() {
		return this.o2N;
	}
	public void setO2N(String o2N) {
		this.o2N = o2N;
	}

	public JinyouTestFive getO3F() {
		return this.o3F;
	}
	public void setO3F(JinyouTestFive o3F) {
		this.o3F = o3F;
	}

}
