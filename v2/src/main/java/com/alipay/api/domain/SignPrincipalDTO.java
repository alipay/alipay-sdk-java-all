package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约主体DTO
 *
 * @author auto create
 * @since 1.0, 2023-07-17 16:05:28
 */
public class SignPrincipalDTO extends AlipayObject {

	private static final long serialVersionUID = 4558837584543549243L;

	/**
	 * 签约主体身份标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 签约主体身份标识类型，有限枚举，
IDENTITY_CARD：身份证号
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 签约主体名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 签约主体手机号码
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
