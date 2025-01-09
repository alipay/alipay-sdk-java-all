package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超导白名单
 *
 * @author auto create
 * @since 1.0, 2024-08-08 16:34:43
 */
public class YunTaskWhiteUserDTO extends AlipayObject {

	private static final long serialVersionUID = 2273939338588647943L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 白名单手机号
	 */
	@ApiField("white_phone")
	private String whitePhone;

	/**
	 * 白名单类型
	 */
	@ApiField("white_type")
	private String whiteType;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getWhitePhone() {
		return this.whitePhone;
	}
	public void setWhitePhone(String whitePhone) {
		this.whitePhone = whitePhone;
	}

	public String getWhiteType() {
		return this.whiteType;
	}
	public void setWhiteType(String whiteType) {
		this.whiteType = whiteType;
	}

}
