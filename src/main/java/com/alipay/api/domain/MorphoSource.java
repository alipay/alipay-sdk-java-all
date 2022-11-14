package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 源码场景的应用源码信息
 *
 * @author auto create
 * @since 1.0, 2019-12-26 15:07:22
 */
public class MorphoSource extends AlipayObject {

	private static final long serialVersionUID = 1777227157437344959L;

	/**
	 * 基于源码的发布流程的源码信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * 调用方侧对应应用唯一标识
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
