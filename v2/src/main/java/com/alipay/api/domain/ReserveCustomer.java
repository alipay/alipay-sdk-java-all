package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约人
 *
 * @author auto create
 * @since 1.0, 2024-04-08 16:49:29
 */
public class ReserveCustomer extends AlipayObject {

	private static final long serialVersionUID = 7727721398537126794L;

	/**
	 * 出生日期，格式yyyy-MM-dd
	 */
	@ApiField("customer_birthday")
	private String customerBirthday;

	/**
	 * 性别
	 */
	@ApiField("customer_gender")
	private String customerGender;

	/**
	 * 证件号
	 */
	@ApiField("customer_identity_no")
	private String customerIdentityNo;

	/**
	 * 婚姻状况
	 */
	@ApiField("customer_medical_status")
	private String customerMedicalStatus;

	/**
	 * 手机号
	 */
	@ApiField("customer_mobile_phone")
	private String customerMobilePhone;

	/**
	 * 预约人姓名
	 */
	@ApiField("customer_name")
	private String customerName;

	public String getCustomerBirthday() {
		return this.customerBirthday;
	}
	public void setCustomerBirthday(String customerBirthday) {
		this.customerBirthday = customerBirthday;
	}

	public String getCustomerGender() {
		return this.customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerIdentityNo() {
		return this.customerIdentityNo;
	}
	public void setCustomerIdentityNo(String customerIdentityNo) {
		this.customerIdentityNo = customerIdentityNo;
	}

	public String getCustomerMedicalStatus() {
		return this.customerMedicalStatus;
	}
	public void setCustomerMedicalStatus(String customerMedicalStatus) {
		this.customerMedicalStatus = customerMedicalStatus;
	}

	public String getCustomerMobilePhone() {
		return this.customerMobilePhone;
	}
	public void setCustomerMobilePhone(String customerMobilePhone) {
		this.customerMobilePhone = customerMobilePhone;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
