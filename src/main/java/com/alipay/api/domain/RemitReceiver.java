package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * RemitReceiver, 汇款收款人信息
 *
 * @author auto create
 * @since 1.0, 2017-06-21 04:56:19
 */
public class RemitReceiver extends AlipayObject {

	private static final long serialVersionUID = 7684612741881476322L;

	/**
	 * address, 收款人地址, 一行显示
	 */
	@ApiField("address")
	private String address;

	/**
	 * alipay_id, 由汇款人输入的收款人支付宝id信息，可以是手机号或者email
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * birthday, 收款人生日，格式YYYYMMDD
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * cellphone, 收款人手机号
	 */
	@ApiField("cellphone")
	private String cellphone;

	/**
	 * email, 收款人email
	 */
	@ApiField("email")
	private String email;

	/**
	 * first_name, 收款人名
	 */
	@ApiField("first_name")
	private String firstName;

	/**
	 * full_name, 收款人全名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * last_name, 收款人的姓
	 */
	@ApiField("last_name")
	private String lastName;

	/**
	 * middle_name, 收款人中间名
	 */
	@ApiField("middle_name")
	private String middleName;

	/**
	 * receive_id, alipay.overseas.fund.remit.recieve.verify接口针对一个特定的收款人返回的唯一id，在alipay.overseas.fund.remit.recieve.create中可以传入此id，保证两个接口对应的收款人一致。如果提供此id，且其他收款人信息与id对应的收款人信息不一致，接口会报错。
	 */
	@ApiField("receive_id")
	private String receiveId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

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

	public String getReceiveId() {
		return this.receiveId;
	}
	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}

}
