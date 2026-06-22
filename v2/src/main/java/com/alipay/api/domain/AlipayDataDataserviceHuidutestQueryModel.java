package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试灰度发布
 *
 * @author auto create
 * @since 1.0, 2026-06-10 15:52:55
 */
public class AlipayDataDataserviceHuidutestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1129366142386964398L;

	/**
	 * 测试
	 */
	@ApiField("test")
	private String test;

	/**
	 * 用户信息
	 */
	@ApiField("user")
	private HuiDuTest user;

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

	public HuiDuTest getUser() {
		return this.user;
	}
	public void setUser(HuiDuTest user) {
		this.user = user;
	}

}
