package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款人信息
 *
 * @author auto create
 * @since 1.0, 2017-06-21 06:40:09
 */
public class RemitSender extends AlipayObject {

	private static final long serialVersionUID = 6425293342118374295L;

	/**
	 * 汇款人生日，格式YYYYMMDD
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 汇款人手机号
	 */
	@ApiField("cellphone")
	private String cellphone;

	/**
	 * 汇款人email
	 */
	@ApiField("email")
	private String email;

	/**
	 * 汇款人名
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * 汇款人全名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 汇款人姓
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * 汇款人中间名
	 */
	@ApiField("middle_name")
	private String middleName;

	/**
	 * 汇款人国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 汇款人职业
	 */
	@ApiField("occupation")
	private String occupation;

	/**
	 * 汇款人居住国家
	 */
	@ApiField("residential_country")
	private String residentialCountry;

	/**
	 * 汇款代理地址信息.
	 */
	@ApiField("send_agent_address")
	private String sendAgentAddress;

	/**
	 * 汇款人地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/**
	 * 汇款人在汇款机构的id
	 */
	@ApiField("sender_id")
	private String senderId;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCellphone() {
		return this.cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
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

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getNationality() {
		return this.nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getOccupation() {
		return this.occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getResidentialCountry() {
		return this.residentialCountry;
	}
	public void setResidentialCountry(String residentialCountry) {
		this.residentialCountry = residentialCountry;
	}

	public String getSendAgentAddress() {
		return this.sendAgentAddress;
	}
	public void setSendAgentAddress(String sendAgentAddress) {
		this.sendAgentAddress = sendAgentAddress;
	}

	public String getSenderAddress() {
		return this.senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderId() {
		return this.senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

}
