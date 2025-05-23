package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工商企业招投标人员信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:22
 */
public class ZmepBiddingTargetInfo extends AlipayObject {

	private static final long serialVersionUID = 7238856755794918493L;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
