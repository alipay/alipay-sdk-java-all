package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权令牌测试
 *
 * @author auto create
 * @since 1.0, 2022-11-01 16:36:41
 */
public class AlipayOpenOperationOpenbizmockTestauthtokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2884669532672855264L;

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
