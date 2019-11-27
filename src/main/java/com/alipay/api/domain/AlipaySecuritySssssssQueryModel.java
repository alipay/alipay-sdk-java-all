package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大法发
 *
 * @author auto create
 * @since 1.0, 2019-11-22 16:57:32
 */
public class AlipaySecuritySssssssQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6116368278978594825L;

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
