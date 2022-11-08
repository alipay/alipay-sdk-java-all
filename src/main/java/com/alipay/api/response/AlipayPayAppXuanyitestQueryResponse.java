package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.JinyouTestFive;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.xuanyitest.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 20:07:03
 */
public class AlipayPayAppXuanyitestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4533714927247457531L;

	/** 
	 * 1
	 */
	@ApiField("f_3_f")
	private JinyouTestFive f3F;

	/** 
	 * 11
	 */
	@ApiField("r_1_openid")
	private String r1Openid;

	/** 
	 * 11
	 */
	@ApiField("r_1_y")
	private String r1Y;

	/** 
	 * 1
	 */
	@ApiField("r_2_n")
	private String r2N;

	public void setF3F(JinyouTestFive f3F) {
		this.f3F = f3F;
	}
	public JinyouTestFive getF3F( ) {
		return this.f3F;
	}

	public void setR1Openid(String r1Openid) {
		this.r1Openid = r1Openid;
	}
	public String getR1Openid( ) {
		return this.r1Openid;
	}

	public void setR1Y(String r1Y) {
		this.r1Y = r1Y;
	}
	public String getR1Y( ) {
		return this.r1Y;
	}

	public void setR2N(String r2N) {
		this.r2N = r2N;
	}
	public String getR2N( ) {
		return this.r2N;
	}

}
