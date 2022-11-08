package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JinyouTestOne
 *
 * @author auto create
 * @since 1.0, 2022-09-13 23:34:11
 */
public class JinyouTestOne extends AlipayObject {

	private static final long serialVersionUID = 8686941681739995667L;

	/**
	 * 1
	 */
	@ApiField("o_1_n")
	private String o1N;

	/**
	 * o_2_y
	 */
	@ApiField("o_2_openid")
	private String o2Openid;

	/**
	 * o_2_y
	 */
	@ApiField("o_2_y")
	private String o2Y;

	/**
	 * o_3_y
	 */
	@ApiField("o_3_openid")
	private String o3Openid;

	/**
	 * o_3_y
	 */
	@ApiField("o_3_y")
	private Long o3Y;

	public String getO1N() {
		return this.o1N;
	}
	public void setO1N(String o1N) {
		this.o1N = o1N;
	}

	public String getO2Openid() {
		return this.o2Openid;
	}
	public void setO2Openid(String o2Openid) {
		this.o2Openid = o2Openid;
	}

	public String getO2Y() {
		return this.o2Y;
	}
	public void setO2Y(String o2Y) {
		this.o2Y = o2Y;
	}

	public String getO3Openid() {
		return this.o3Openid;
	}
	public void setO3Openid(String o3Openid) {
		this.o3Openid = o3Openid;
	}

	public Long getO3Y() {
		return this.o3Y;
	}
	public void setO3Y(Long o3Y) {
		this.o3Y = o3Y;
	}

}
