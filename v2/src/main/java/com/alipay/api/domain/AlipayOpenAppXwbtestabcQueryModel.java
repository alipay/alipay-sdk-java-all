package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xuweibo测试用
 *
 * @author auto create
 * @since 1.0, 2025-05-26 21:09:51
 */
public class AlipayOpenAppXwbtestabcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5689839687281711333L;

	/**
	 * 1
	 */
	@ApiField("testabc")
	private String testabc;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public String getTestabc() {
		return this.testabc;
	}
	public void setTestabc(String testabc) {
		this.testabc = testabc;
	}

	public String getXwb() {
		return this.xwb;
	}
	public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
