package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 庆永测试api
 *
 * @author auto create
 * @since 1.0, 2024-08-06 15:59:29
 */
public class AlipayBossProdQingyongtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2256361722396259375L;

	/**
	 * 1
	 */
	@ApiField("enum_2")
	private String enum2;

	/**
	 * 1
	 */
	@ApiField("enums")
	private String enums;

	/**
	 * 1
	 */
	@ApiField("key_id")
	private String keyId;

	public String getEnum2() {
		return this.enum2;
	}
	public void setEnum2(String enum2) {
		this.enum2 = enum2;
	}

	public String getEnums() {
		return this.enums;
	}
	public void setEnums(String enums) {
		this.enums = enums;
	}

	public String getKeyId() {
		return this.keyId;
	}
	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

}
