package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权令牌测试
 *
 * @author auto create
 * @since 1.0, 2023-05-31 11:52:20
 */
public class AlipayOpenOperationOpenbizmockTestauthtokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2121257742186856118L;

	/**
	 * 测试专用
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(String aOpenId) {
		this.aOpenId = aOpenId;
	}

}
