package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xuweibo测试api
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:00:46
 */
public class AlipayOpenAppXwbtstabcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6378524324995772657L;

	/**
	 * 1
	 */
	@ApiField("xwbaa")
	private String xwbaa;

	public String getXwbaa() {
		return this.xwbaa;
	}
	public void setXwbaa(String xwbaa) {
		this.xwbaa = xwbaa;
	}

}
