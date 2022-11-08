package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金柚测试toMsgapi
 *
 * @author auto create
 * @since 1.0, 2022-09-14 12:54:00
 */
public class AlipayDataAiserviceJinyoutestSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5358134183215449164L;

	/**
	 * 11
	 */
	@ApiField("t_1_f")
	private JinyouTestFive t1F;

	/**
	 * 1
	 */
	@ApiField("t_1_n")
	private String t1N;

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

	public JinyouTestFive getT1F() {
		return this.t1F;
	}
	public void setT1F(JinyouTestFive t1F) {
		this.t1F = t1F;
	}

	public String getT1N() {
		return this.t1N;
	}
	public void setT1N(String t1N) {
		this.t1N = t1N;
	}

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

}
