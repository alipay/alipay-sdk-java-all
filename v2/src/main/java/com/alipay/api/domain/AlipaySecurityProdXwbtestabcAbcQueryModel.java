package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xuwebio测试用
 *
 * @author auto create
 * @since 1.0, 2022-07-07 11:15:41
 */
public class AlipaySecurityProdXwbtestabcAbcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1531543777289587428L;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public String getXwb() {
		return this.xwb;
	}
	public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
