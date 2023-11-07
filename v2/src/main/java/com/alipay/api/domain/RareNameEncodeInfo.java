package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生僻字姓名转码信息
 *
 * @author auto create
 * @since 1.0, 2023-08-23 14:20:54
 */
public class RareNameEncodeInfo extends AlipayObject {

	private static final long serialVersionUID = 2754685469223875816L;

	/**
	 * 枚举值: PUA,UNICODE
	 */
	@ApiField("encode")
	private String encode;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getEncode() {
		return this.encode;
	}
	public void setEncode(String encode) {
		this.encode = encode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
