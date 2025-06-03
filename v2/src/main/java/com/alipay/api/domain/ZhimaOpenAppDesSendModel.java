package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tomayi消息测试
 *
 * @author auto create
 * @since 1.0, 2019-06-05 22:19:54
 */
public class ZhimaOpenAppDesSendModel extends AlipayObject {

	private static final long serialVersionUID = 6176556438693718653L;

	/**
	 * 21
	 */
	@ApiField("com")
	private GavintestNewLeveaOne com;

	/**
	 * 1
	 */
	@ApiField("test")
	private String test;

	public GavintestNewLeveaOne getCom() {
		return this.com;
	}
	public void setCom(GavintestNewLeveaOne com) {
		this.com = com;
	}

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
