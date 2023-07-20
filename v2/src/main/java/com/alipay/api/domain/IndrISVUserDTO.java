package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV用户信息DTO
 *
 * @author auto create
 * @since 1.0, 2023-05-06 15:59:27
 */
public class IndrISVUserDTO extends AlipayObject {

	private static final long serialVersionUID = 6391921651695446555L;

	/**
	 * 地址信息
	 */
	@ApiField("address")
	private IndrISVAddressDTO address;

	/**
	 * 电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 名字拼音
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 全名(英文或者拼音)
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 证件号（身份证号， 固定18位或15位）
	 */
	@ApiField("identity_card_number")
	private String identityCardNumber;

	/**
	 * 证件类型：ID_CARD,PASSPORT
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 姓氏拼音
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 中文姓名，UTF8编码
	 */
	@ApiField("native_full_name")
	private String nativeFullName;

	/**
	 * 区号
	 */
	@ApiField("phone_area_code")
	private String phoneAreaCode;

	/**
	 * 电话的二位国家码
	 */
	@ApiField("phone_country")
	private String phoneCountry;

	/**
	 * 手机号， 手机号
比如：13283491863（不含区号）
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public IndrISVAddressDTO getAddress() {
		return this.address;
	}
	public void setAddress(IndrISVAddressDTO address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIdentityCardNumber() {
		return this.identityCardNumber;
	}
	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNativeFullName() {
		return this.nativeFullName;
	}
	public void setNativeFullName(String nativeFullName) {
		this.nativeFullName = nativeFullName;
	}

	public String getPhoneAreaCode() {
		return this.phoneAreaCode;
	}
	public void setPhoneAreaCode(String phoneAreaCode) {
		this.phoneAreaCode = phoneAreaCode;
	}

	public String getPhoneCountry() {
		return this.phoneCountry;
	}
	public void setPhoneCountry(String phoneCountry) {
		this.phoneCountry = phoneCountry;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
