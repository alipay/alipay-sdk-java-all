package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大法发
 *
 * @author auto create
 * @since 1.0, 2020-02-07 17:26:42
 */
public class AlipaySecuritySssssssQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2144243771163885845L;

	/**
	 * 金额
	 */
	@ApiField("ddd")
	private String ddd;

	/**
	 * 阿法
	 */
	@ApiField("x_adfa")
	private String xAdfa;

	public String getDdd() {
		return this.ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getxAdfa() {
		return this.xAdfa;
	}
	public void setxAdfa(String xAdfa) {
		this.xAdfa = xAdfa;
	}

}
