package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房源常量字典查询
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:12:26
 */
public class AlipayCommerceHousingDictQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3377256198891297844L;

	/**
	 * 单个值，非固定枚举值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 枚举类型(二手房/租房/独栋/小区)
	 */
	@ApiField("enum_type")
	private String enumType;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEnumType() {
		return this.enumType;
	}
	public void setEnumType(String enumType) {
		this.enumType = enumType;
	}

}
