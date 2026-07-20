package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV用户信息DTO
 *
 * @author auto create
 * @since 1.0, 2026-06-12 11:57:41
 */
public class IndrISVUserDTO extends AlipayObject {

	private static final long serialVersionUID = 8767472429186194921L;

	/**
	 * 地址信息
	 */
	@ApiField("address")
	private IndrISVAddressDTO address;

	/**
	 * 生日
	 */
	@ApiField("birth_date")
	private String birthDate;

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
	 * 证件地址
	 */
	@ApiField("identity_address")
	private IndrISVAddressDTO identityAddress;

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

	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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

	public IndrISVAddressDTO getIdentityAddress() {
		return this.identityAddress;
	}
	public void setIdentityAddress(IndrISVAddressDTO identityAddress) {
		this.identityAddress = identityAddress;
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
