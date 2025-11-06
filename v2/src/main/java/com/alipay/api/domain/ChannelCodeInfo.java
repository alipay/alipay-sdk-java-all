package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道的code和name的实体
 *
 * @author auto create
 * @since 1.0, 2024-11-04 10:28:00
 */
public class ChannelCodeInfo extends AlipayObject {

	private static final long serialVersionUID = 4392424854492232699L;

	/**
	 * 渠道的code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 渠道code对应的name
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
