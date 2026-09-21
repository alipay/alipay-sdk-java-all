package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:51:07
 */
public class CompanyImportItem extends AlipayObject {

	private static final long serialVersionUID = 7653277853161413547L;

	/**
	 * 城市标准名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 公司名
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 公司在税务局登记的税号
	 */
	@ApiField("company_tax_no")
	private String companyTaxNo;

	/**
	 * 联络地址
	 */
	@ApiField("contact_address")
	private String contactAddress;

	/**
	 * 联系邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 公司法人或实际运营人或对接支付宝的负责人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 公司联系电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 标识自己的数据来源 可以同商户pid
	 */
	@ApiField("source")
	private String source;

	/**
	 * 本城市内本公司的司机数
	 */
	@ApiField("surveyed_driver_count")
	private Long surveyedDriverCount;

	/**
	 * 本公司在本城市的运营车辆数
	 */
	@ApiField("surveyed_vehicle_count")
	private Long surveyedVehicleCount;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyTaxNo() {
		return this.companyTaxNo;
	}
	public void setCompanyTaxNo(String companyTaxNo) {
		this.companyTaxNo = companyTaxNo;
	}

	public String getContactAddress() {
		return this.contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Long getSurveyedDriverCount() {
		return this.surveyedDriverCount;
	}
	public void setSurveyedDriverCount(Long surveyedDriverCount) {
		this.surveyedDriverCount = surveyedDriverCount;
	}

	public Long getSurveyedVehicleCount() {
		return this.surveyedVehicleCount;
	}
	public void setSurveyedVehicleCount(Long surveyedVehicleCount) {
		this.surveyedVehicleCount = surveyedVehicleCount;
	}

}
