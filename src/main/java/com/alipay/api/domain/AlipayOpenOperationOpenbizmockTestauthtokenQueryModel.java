package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权令牌测试
 *
 * @author auto create
 * @since 1.0, 2022-08-16 21:12:03
 */
public class AlipayOpenOperationOpenbizmockTestauthtokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6433857487368628994L;

	/**
	 * 测试专用
	 */
	@ApiField("a")
	private String a;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

}
