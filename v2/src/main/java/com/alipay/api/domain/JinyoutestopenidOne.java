package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Jinyoutestopenid1
 *
 * @author auto create
 * @since 1.0, 2022-11-10 17:37:51
 */
public class JinyoutestopenidOne extends AlipayObject {

	private static final long serialVersionUID = 7835562138686915636L;

	/**
	 * 我晚点
	 */
	@ApiField("c_1")
	private String c1;

	/**
	 * 1
	 */
	@ApiField("q")
	private String q;

	/**
	 * 1
	 */
	@ApiField("q_1_open_id")
	private String q1OpenId;

	public String getC1() {
		return this.c1;
	}
	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getQ() {
		return this.q;
	}
	public void setQ(String q) {
		this.q = q;
	}

	public String getQ1OpenId() {
		return this.q1OpenId;
	}
	public void setQ1OpenId(String q1OpenId) {
		this.q1OpenId = q1OpenId;
	}

}
