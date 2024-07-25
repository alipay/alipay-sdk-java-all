package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约人
 *
 * @author auto create
 * @since 1.0, 2024-07-05 11:42:26
 */
public class ReserveCustomer extends AlipayObject {

	private static final long serialVersionUID = 3886237893925463386L;

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
	 * 证件类型
	 */
	@ApiField("customer_identity_type")
	private String customerIdentityType;

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

	/**
	 * 是否备孕
	 */
	@ApiField("prepare_pregnancy")
	private Boolean preparePregnancy;

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

	public String getCustomerIdentityType() {
		return this.customerIdentityType;
	}
	public void setCustomerIdentityType(String customerIdentityType) {
		this.customerIdentityType = customerIdentityType;
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

	public Boolean getPreparePregnancy() {
		return this.preparePregnancy;
	}
	public void setPreparePregnancy(Boolean preparePregnancy) {
		this.preparePregnancy = preparePregnancy;
	}

}
