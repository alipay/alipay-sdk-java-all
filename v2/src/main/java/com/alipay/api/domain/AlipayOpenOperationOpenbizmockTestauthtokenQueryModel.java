package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权令牌测试
 *
 * @author auto create
 * @since 1.0, 2022-12-13 14:46:40
 */
public class AlipayOpenOperationOpenbizmockTestauthtokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5294975265413222459L;

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
