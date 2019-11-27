package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三克1115迭代预发验收
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class AlipayOpenAppHahaPayModel extends AlipayObject {

	private static final long serialVersionUID = 4271741283658316337L;

	/**
	 * 123
	 */
	@ApiField("sanketest")
	private String sanketest;

	public String getSanketest() {
		return this.sanketest;
	}
	public void setSanketest(String sanketest) {
		this.sanketest = sanketest;
	}

}
