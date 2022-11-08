package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 麦瑟测试用spi
 *
 * @author auto create
 * @since 1.0, 2022-09-07 11:10:20
 */
public class AlipayOpenAppOpenmockQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1564561473146797772L;

	/**
	 * 21
	 */
	@ApiField("adfs")
	private String adfs;

	/**
	 * xxxxx
	 */
	@ApiField("xxsa")
	private String xxsa;

	public String getAdfs() {
		return this.adfs;
	}
	public void setAdfs(String adfs) {
		this.adfs = adfs;
	}

	public String getXxsa() {
		return this.xxsa;
	}
	public void setXxsa(String xxsa) {
		this.xxsa = xxsa;
	}

}
