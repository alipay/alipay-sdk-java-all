package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款人信息
 *
 * @author auto create
 * @since 1.0, 2026-10-19 19:42:55
 */
public class TransferUserBeneficiaryW extends AlipayObject {

	private static final long serialVersionUID = 3791995523498329898L;

	/**
	 * 生日
	 */
	@ApiField("birth_date")
	private String birthDate;

	/**
	 * 证件信息
	 */
	@ApiField("credential")
	private TransferCredentialw credential;

	/**
	 * 用户性别：Male/Female
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 用户地址信息
	 */
	@ApiField("user_address")
	private TransferAddressInfow userAddress;

	/**
	 * 用户邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	/**
	 * 用户编号
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名字信息
	 */
	@ApiField("user_name")
	private TransferUserNamew userName;

	/**
	 * 手机号码
	 */
	@ApiField("user_phone_no")
	private String userPhoneNo;

	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public TransferCredentialw getCredential() {
		return this.credential;
	}
	public void setCredential(TransferCredentialw credential) {
		this.credential = credential;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return this.nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public TransferAddressInfow getUserAddress() {
		return this.userAddress;
	}
	public void setUserAddress(TransferAddressInfow userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return this.userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public TransferUserNamew getUserName() {
		return this.userName;
	}
	public void setUserName(TransferUserNamew userName) {
		this.userName = userName;
	}

	public String getUserPhoneNo() {
		return this.userPhoneNo;
	}
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

}
