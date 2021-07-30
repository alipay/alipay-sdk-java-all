package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶基于小程序源码创建应用的源码信息
 *
 * @author auto create
 * @since 1.0, 2019-12-08 18:38:21
 */
public class MorphoCreateSource extends AlipayObject {

	private static final long serialVersionUID = 4565177159389582567L;

	/**
	 * 小程序源码地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 调用闪蝶基于小程序源码创建应用时对应调用方侧应用的唯一标识
	 */
	@ApiField("id")
	private String id;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
