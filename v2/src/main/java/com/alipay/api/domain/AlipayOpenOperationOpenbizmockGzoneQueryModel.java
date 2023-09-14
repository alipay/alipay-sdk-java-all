package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * V3网关测试gzone转发
 *
 * @author auto create
 * @since 1.0, 2023-05-30 17:12:53
 */
public class AlipayOpenOperationOpenbizmockGzoneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2252423294593918191L;

	/**
	 * 测试
	 */
	@ApiField("a")
	private String a;

	/**
	 * 测试
	 */
	@ApiField("a_openid")
	private String aOpenid;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getaOpenid() {
		return this.aOpenid;
	}
	public void setaOpenid(String aOpenid) {
		this.aOpenid = aOpenid;
	}

}
