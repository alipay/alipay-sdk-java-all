package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 庆永测试api
 *
 * @author auto create
 * @since 1.0, 2024-05-27 17:09:18
 */
public class AlipayBossProdQingyongtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5831539173586471118L;

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
